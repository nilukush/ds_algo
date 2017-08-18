package com.ds_algo;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Node n3 = BTFactory.makeBT();
        test_algo(n3);
    }

    private static void test_algo(Node n3) {
        test_minHeightToLeaf(n3);
        System.out.println();
        test_lca_bt(n3);
    }

    private static void test_minHeightToLeaf(Node n3) {
        System.out.println("[minHeightToLeaf] [n3] " + new MinHeightToLeaf(n3).compute());
        System.out.println("[minHeightToLeaf] [n5] " + new MinHeightToLeaf(n3.l).compute());
        System.out.println("[minHeightToLeaf] [n6] " + new MinHeightToLeaf(n3.r).compute());
        System.out.println("[minHeightToLeaf] [n2] " + new MinHeightToLeaf(n3.l.r).compute());
        System.out.println("[minHeightToLeaf] [n7] " + new MinHeightToLeaf(n3.r.l).compute());
        System.out.println("[minHeightToLeaf] [n8] " + new MinHeightToLeaf(n3.r.l.l).compute());
        System.out.println("[minHeightToLeaf] [n10] " + new MinHeightToLeaf(n3.r.r).compute());
    }

    private static void test_lca_bt(Node n3) {
        Node lca_bt = new LCA_BT(n3, n3.l.r, n3.r.l.l).compute();
        System.out.println("[lca_bt] [n3.l.r] [n3.r.l.l] " + ((null == lca_bt) ? null : lca_bt.getK()));

        lca_bt = new LCA_BT(n3, n3.r.l.l, n3.r.r).compute();
        System.out.println("[lca_bt] [n3.r.l.l] [n3.r.r] " + ((null == lca_bt) ? null : lca_bt.getK()));
    }
}
