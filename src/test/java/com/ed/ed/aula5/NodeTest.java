package com.ed.ed.aula5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    void criacaoDeNohComMultiplosObjetos() {
        var node = new Node(1);
        assertEquals(1, node.value);
    }

    @Test
    void proximoNode() {
        var node = new Node(1);
        assertNull(node.next);
    }

    @Test
    void nextNodeWithValue() {
        var next = new Node(2);
        var node = new Node(1, next);
        assertEquals(node.next, next);
    }
}
