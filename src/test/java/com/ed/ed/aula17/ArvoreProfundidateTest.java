package com.ed.ed.aula17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ArvoreProfundidateTest {

    @Test
    void initDefaults() {
        ArvoreProfundidade arvore = new ArvoreProfundidade();
        assertNull(arvore.raiz);
    }

    @Test
    void comRaiz() {
        var noh = new Noh(1);
        ArvoreProfundidade arvore = new ArvoreProfundidade(noh);
        assertEquals(noh, arvore.raiz);
    }

    @Test void alturaDaArvore() {
        var noh = new Noh(1);
        var arvore = new ArvoreProfundidade(noh);
        assertEquals(1, arvore.altura());
    }

}
