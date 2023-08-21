package com.ed.ed.aula9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class fila_test {

    @Test
    void filaEstaVazia() {
        var fila = new Fila();

        assertTrue(fila.isEmpty());
        assertEquals(0, fila.length());
    }

    @Test 
    void enfileirarUmElemento() {
        var fila = new Fila();
        fila.deque(1); 
        assertFalse(fila.isEmpty());
        assertEquals(1, fila.first());
    }

    @Test 
    void enfileirarDoisElemento() {
        var fila = new Fila();
        fila.deque(1); 
        fila.deque(2); 
        assertFalse(fila.isEmpty());
        assertEquals(1, fila.first());
    }

    @Test void desenfileirarFilaVazia() { 
        var fila = new Fila();
        assertThrows(IndexOutOfBoundsException.class, () -> fila.desenfileirar());
    }

    @Test void desenfileirar() { 
        var fila = new Fila();

        fila.deque(1);
        fila.deque(2);
        fila.deque(3);
        fila.deque(4);

        assertEquals(1, fila.desenfileirar());
        assertEquals(2, fila.desenfileirar());
        assertEquals(3, fila.desenfileirar());
        assertEquals(4, fila.desenfileirar());
        assertTrue(fila.isEmpty());

    }
}
