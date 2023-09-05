package com.ed.ed.aula17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class NohTestes {
    @Test
    void initiComDefaults() {
        Noh noh = new Noh(5);
        assertEquals(5, noh.value);
        assertNull(noh.pai);
        assertNull(noh.irmaoDireito);
        assertNull(noh.filhoEsquerdo);
    }

    @Test
    void initComPaiNomeado() {
        Noh pai = new Noh(5);
        Noh filho = new Noh(4, pai);
        assertEquals(4, filho.value);
        assertEquals(pai, filho.pai);
        assertEquals(filho, pai.filhoEsquerdo);
    }

    @Test
    void adicionarFilho() {
        Noh pai = new Noh(5);
        Noh filho = new Noh(4);
        pai.add(filho);
        assertEquals(pai, filho.pai);
        assertEquals(filho, pai.filhoEsquerdo);
        assertNull(filho.irmaoDireito);
    }

    @Test
    void adicionarDoisFilhos() {
        Noh pai = new Noh(5);
        Noh filho = new Noh(4);
        Noh filho2 = new Noh(3);
        pai.add(filho);
        pai.add(filho2);
        assertEquals(pai, filho.pai);
        assertEquals(filho, pai.filhoEsquerdo);
        assertEquals(filho2, filho.irmaoDireito);
        assertNull(filho2.irmaoDireito);
    }

    @Test
    void adicionarTresFilhos() {
        Noh pai = new Noh(5);
        Noh filho = new Noh(4);
        Noh filho2 = new Noh(3);
        Noh filho3 = new Noh(2);
        pai.add(filho);
        pai.add(filho2);
        pai.add(filho3);

        assertEquals(pai, filho.pai);
        assertEquals(filho, pai.filhoEsquerdo);
        assertEquals(filho2, filho.irmaoDireito);
        assertEquals(filho3, filho2.irmaoDireito);
        assertNull(filho3.irmaoDireito);
    }
}
