package com.ed.ed.aula5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ListaEncadeadaTest {

    @Test
    void testeTamanho() {
        var listaLigada = new ListaEncadeada();
        assertEquals(0, listaLigada.length);
        assertNull(listaLigada.firstNode);
    }

    @Test
    void adicionarValor() {
        var listaLigada = new ListaEncadeada();
        listaLigada.add(1);
        assertEquals(1, listaLigada.length);
    }

    @Test
    void erroAotentarAcessarListaVazia() {
        var listaLigada = new ListaEncadeada();
        assertThrows(NullPointerException.class, () -> listaLigada.get(0));
    }

    @Test
    void acessarPrimeiroValor() {
        var listaLigada = new ListaEncadeada();
        listaLigada.add(1);
        assertEquals(1, listaLigada.get(0));
    }

    @Test
    void acessarSegundoValir() {
        var listaLigada = new ListaEncadeada();
        listaLigada.add(1);
        listaLigada.add(2);
        assertEquals(2, listaLigada.get(1));
    }
    @Test
    void acessaTerceiroValor() {
        var listaLigada = new ListaEncadeada();
        listaLigada.add(1);
        listaLigada.add(2);
        listaLigada.add(3);
        System.out.println(listaLigada.firstNode);
        assertEquals(3, listaLigada.get(2));
    }

    @Test
    void adicionarNoInicio() {
        var listaLigada = new ListaEncadeada();
        listaLigada.add(1);
        listaLigada.add(2);
        listaLigada.add(3, 0);
        assertEquals(3, listaLigada.firstNode.value);
    }
}
