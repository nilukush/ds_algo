package com.ds_algo;

import org.jetbrains.annotations.Contract;

/**
 * Created by nilesh.kumar on 04/08/17.
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see BT
 * @see Node
 * @see Height
 * @since 1.0-SNAPSHOT
 * <p>
 * <p>
 * Find the maximum sum leaf to root path in a Binary Tree
 * <p>
 * Given a Binary Tree, find the maximum sum path from a leaf to root. For example, in the following tree, there are three leaf to root paths 8->-2->10, -4->-2->10 and 7->10.
 * The sums of these three paths are 16, 4 and 17 respectively. The maximum of them is 17 and the path for maximum is 7->10.
 */
public class MinHeightToLeaf extends BT {
    private Node n;

    MinHeightToLeaf(Node n) {
        this.n = n;
    }

    @Override
    public int compute() {
        if (null == n) return 0;
        return minHToL(new Height(n.l).compute(), new Height(n.r).compute());
    }

    @Contract(pure = true)
    private int minHToL(int hl, int hr) {
        if (hl <= 0) return hr;
        else if (hr <= 0) return hl;
        else return (hl < hr) ? hl : hr;
    }
}
