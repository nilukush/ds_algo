package com.ds_algo;

import org.jetbrains.annotations.NotNull;

/**
 * Created by nilesh.kumar on 04/08/17.
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see Node
 * @since 1.0-SNAPSHOT
 */
class BTFactory {
    @NotNull
    static Node makeBT() {
        Node n2 = getNode(2);
        Node n5 = getNode(n2);

        Node n8 = getNode(8);
        Node n7 = getNode(n8, 7);

        Node n10 = getNode(10);
        Node n6 = getNode(n7, n10, 6);

        return getNode(n5, n6, 3); // ROOT
    }

    @NotNull
    private static Node getNode(int k) {
        return new Node(k);
    }

    @NotNull
    private static Node getNode(Node n2) {
        Node n5 = getNode(5);
        n5.r = n2;
        return n5;
    }

    @NotNull
    private static Node getNode(Node n8, int k) {
        Node n7 = getNode(k);
        n7.l = n8;
        return n7;
    }

    @NotNull
    private static Node getNode(Node n5, Node n6, int k) {
        Node n3 = getNode(n5, k);
        n3.r = n6;
        return n3;
    }
}
