package com.ds_algo;

/**
 * Created by nilesh.kumar on 04/08/17.
 * <p>
 * Compute height of a BT
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see BT
 * @see Node
 * @since 1.0-SNAPSHOT
 */
public class Height extends BT {
    private Node n;

    Height(Node n) {
        this.n = n;
    }

    @Override
    public int compute() {
        return height(this.n);
    }

    private int height(Node n) {
        if (null == n) return 0;
        int hl = height(n.l);
        int hr = height(n.r);
        return (hl > hr) ? 1 + hl : 1 + hr;
    }
}
