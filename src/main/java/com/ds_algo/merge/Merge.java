package com.ds_algo.merge;

import org.jetbrains.annotations.NotNull;

public class Merge {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 6, 21, 25};
        int[] second = new int[]{2, 3, 5, 27};
        int[] merged = merge(first, second);
        printArray(merged); // [1, 2, 3, 3, 5, 21, 25, 27]
    }

    public static int[] merge(@NotNull int[] first, @NotNull int[] second) {
        int lengthFirst = first.length;
        int lengthSecond = second.length;
        int[] merged = new int[lengthFirst + lengthSecond];

        int arraySmaller = lengthFirst < lengthSecond ? 0 : 1;

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        return arraySmaller == 1 ? mergeInternal(second, lengthSecond, iSecond, first, lengthFirst, iFirst, merged, iMerged) :
                mergeInternal(first, lengthFirst, iFirst, second, lengthSecond, iSecond, merged, iMerged);
    }

    private static int[] mergeInternal(int[] small, int lengthSmall, int iSmall, int[] large, int lengthLarge, int iLarge, int[] merged, int iMerged) {
        while (iSmall < lengthSmall) {
            while (iLarge < lengthLarge && (small[iSmall] >= large[iLarge])) {
                merged[iMerged++] = large[iLarge++];
            }

            merged[iMerged++] = small[iSmall++];
        }

        return merged;
    }

    public static void printArray(@NotNull int[] arr) {
        for (int item : arr) {
            System.out.print(item);
            System.out.print(' ');
        }
    }
}
