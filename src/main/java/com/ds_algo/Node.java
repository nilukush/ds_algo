package com.ds_algo;

import lombok.Data;

/**
 * Created by nilesh.kumar on 04/08/17.
 *
 * @author nilesh.kumar
 * @version 1.0-SNAPSHOT
 * @see Data
 * @since 1.0-SNAPSHOT
 */
@Data
public class Node {
    public int k;
    public Node l = null;
    public Node r = null;

    Node(int k) {
        this.k = k;
    }
}
