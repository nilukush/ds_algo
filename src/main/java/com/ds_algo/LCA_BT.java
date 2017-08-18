package com.ds_algo;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 * Created by nilesh.kumar on 18/08/17.
 * <p>
 * Compute least common ancestor of a binary tree
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see Node
 * @since 1.0-SNAPSHOT
 */
class LCA_BT {
    private Node n, n_first, n_second;

    LCA_BT(Node n, Node n_first, Node n_second) {
        this.n = n;
        this.n_first = n_first;
        this.n_second = n_second;
    }

    Node compute() {
        return lca_bt(n);
    }

    @Nullable
    private Node lca_bt(Node n) {
        if (isNotValid(n)) return null;
        if (isLCA(n)) return n;
        return getLCA(n);
    }

    private Node getLCA(Node n) {
        Node lca_l = lca_bt(n.getL());
        Node lca_r = lca_bt(n.getR());

        if ((null != lca_l) && (null != lca_r)) return n;

        return (null != lca_l) ? lca_l : lca_r;
    }

    private boolean isLCA(Node n) {
        return (n.getK() == n_first.getK()) || (n.getK() == n_second.getK());
    }

    @Contract(value = "null -> true", pure = true)
    private boolean isNotValid(Node n) {
        return (null == n) || (null == n_first) || (null == n_second);
    }
}
