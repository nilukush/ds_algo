package com.ds_algo;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        Node n3 = BTFactory.makeBT();
        System.out.println("[minHeightToLeaf] [n3] " + new MinHeightToLeaf(n3).compute());
        System.out.println("[minHeightToLeaf] [n5] " + new MinHeightToLeaf(n3.l).compute());
        System.out.println("[minHeightToLeaf] [n6] " + new MinHeightToLeaf(n3.r).compute());
        System.out.println("[minHeightToLeaf] [n2] " + new MinHeightToLeaf(n3.l.r).compute());
        System.out.println("[minHeightToLeaf] [n7] " + new MinHeightToLeaf(n3.r.l).compute());
        System.out.println("[minHeightToLeaf] [n8] " + new MinHeightToLeaf(n3.r.l.l).compute());
        System.out.println("[minHeightToLeaf] [n10] " + new MinHeightToLeaf(n3.r.r).compute());
    }

}
