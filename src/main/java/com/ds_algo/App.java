package com.ds_algo;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        Node n3 = getBT();
        System.out.println("[minHeightToLeaf] [n3] " + new MinHeightToLeaf(n3).compute());
        System.out.println("[minHeightToLeaf] [n5] " + new MinHeightToLeaf(n3.l).compute());
        System.out.println("[minHeightToLeaf] [n6] " + new MinHeightToLeaf(n3.r).compute());
        System.out.println("[minHeightToLeaf] [n2] " + new MinHeightToLeaf(n3.l.r).compute());
        System.out.println("[minHeightToLeaf] [n7] " + new MinHeightToLeaf(n3.r.l).compute());
        System.out.println("[minHeightToLeaf] [n8] " + new MinHeightToLeaf(n3.r.l.l).compute());
        System.out.println("[minHeightToLeaf] [n10] " + new MinHeightToLeaf(n3.r.r).compute());
    }

    private static Node getBT() {
        Node n2 = getNode(2);
        Node n5 = getNode(5);
        n5.r = n2;

        Node n8 = getNode(8);
        Node n7 = getNode(7);
        n7.l = n8;

        Node n10 = getNode(10);
        Node n6 = getNode(6);
        n6.l = n7;
        n6.r = n10;

        Node n3 = getNode(3);
        n3.l = n5;
        n3.r = n6;
        return n3; // ROOT
    }

    @org.jetbrains.annotations.NotNull
    private static Node getNode(int k) {
        return new Node(k);
    }
}
