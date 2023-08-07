package com.ed.ed.aula6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class NohTest {

    @Test
    void iniciarComValoresPadrao() {
        var noh = new Noh(4);
        assertEquals(4, noh.value);
        assertNull(noh.left);
        assertNull(noh.right);
    }

    @Test
    void iniciaComNoEsquerdo() {
        var left = new Noh(1);
        var noh = new Noh(2, left);
        assertEquals(left, noh.left);
        assertNull(noh.right);
        var noh3 = new Noh(3, left);

        assertEquals(left, noh3.left);
        assertNull(noh3.right);

    }

    @Test
    void iniciaComEsquerdoEDireito() {
        var left = new Noh(1);
        var right = new Noh(2);
        var noh = new Noh(3, left, right);
        assertEquals(left, noh.left);
        assertEquals(right, noh.right);

    }
}
