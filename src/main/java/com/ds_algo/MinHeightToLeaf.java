package com.ds_algo;

import org.jetbrains.annotations.Contract;

/**
 * Created by nilesh.kumar on 04/08/17.
 * <p>
 * Compute minimum height of a node to leaf
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see BT
 * @see Node
 * @see Height
 * @since 1.0-SNAPSHOT
 * <p>
 * <p>
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
