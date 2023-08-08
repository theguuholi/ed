package com.ed.ed.aula7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PilhaTest {

    @Test
    void topoComListaVazia() {
        var pilha = new Pilha();
        assertEquals(pilha.topo(), "Empty List");
    }

    @Test
    void estaVaziaComPilhaVazia() {
        var pilha = new Pilha();
        assertTrue(pilha.isVazia());
        pilha.empilhar("A");
        assertFalse(pilha.isVazia());

    }

    @Test
    void pilhaComTopoNaoVazia() {
        var pilha = new Pilha();
        pilha.empilhar("A");
        assertEquals(pilha.topo(), "A");

    }

    @Test
    void desempilhar() {
        var pilha = new Pilha();
        pilha.empilhar("A");
        assertEquals(pilha.pop(), "A");

    }

    @Test
    void primeiroEntrarUltimoASair() {
        var pilha = new Pilha();
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        assertEquals(pilha.pop(), "C");
        assertEquals(pilha.pop(), "B");
        assertEquals(pilha.pop(), "A");

    }

}
