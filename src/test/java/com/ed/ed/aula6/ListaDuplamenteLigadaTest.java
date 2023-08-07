package com.ed.ed.aula6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ListaDuplamenteLigadaTest {

    @Test
    void start() {
        var list = new ListaDuplamenteLigada();

        assertEquals(0, list.tam);

        assertNull(list.first);

        assertNull(list.last);

    }

    @Test
    void addfirst() {
        var list = new ListaDuplamenteLigada();
        list.add(0);

        assertEquals(1, list.tam);

        var first = list.first;
        assertEquals(0, first.value);

        assertEquals(first, list.last);

        assertNull(first.left);

        assertNull(first.right);

    }

    @Test
    void addSegundo() {
        var list = new ListaDuplamenteLigada();
        list.add(0);

        list.add(1);

        assertEquals(2, list.tam);

        var first = list.first;
        assertEquals(0, first.value);

        var last = list.last;

        assertEquals(1, last.value);

        assertEquals(first, last.left);

        assertEquals(last, first.right);

        assertNull(first.left);

        assertNull(last.right);

    }

    // @Test
    // public void test_add_terceiro() {
    //     var lista = new ListaDuplamenteLigada();
    //     lista.add(0);
    //     lista.add(1);
    //     lista.add(2);
    //     assertEquals(3, lista.tam);
    //     var first = lista.first;
    //     assertEquals(0, first.value);
    //     var last = lista.last;
    //     var segundo = first.left;
    //     assertEquals(1, segundo.value);
    //     assertEquals(2, last.value);

    //     assertEquals(first, segundo.left);

    //     assertEquals(segundo, last.left);
    //     assertEquals(last, segundo.left);

    //     assertNull(first.left);
    //     assertNull(last.left);

    // }

    @Test
    public void test_add_first_a_esquerda() {
        var lista = new ListaDuplamenteLigada();
        lista.addLeft(0);
        assertEquals(1, lista.tam);
        var first = lista.first;
        assertEquals(0, first.value);
        assertEquals(first, lista.last);
        assertNull(first.left);
        assertNull(first.left);

    }

    // @Test
    // public void test_add_segundo_a_esquerda() {
    //     var lista = new ListaDuplamenteLigada();
    //     lista.addLeft(0);
    //     lista.addLeft(1);
    //     assertEquals(2, lista.tam);
    //     var first = lista.first;
    //     assertEquals(1, first.value);
    //     var last = lista.last;
    //     assertEquals(0, last.value);
    //     assertEquals(first, last.left);
    //     assertEquals(last, first.left);
    //     assertNull(first.left);
    //     assertNull(last.left);

    // }

    // @Test
    // public void addTerceiro() {
    //     var lista = new ListaDuplamenteLigada();
    //     lista.addLeft(0);
    //     lista.addLeft(1);
    //     lista.addLeft(2);
    //     assertEquals(3, lista.tam);
    //     var first = lista.first;
    //     assertEquals(2, first.value);
    //     var last = lista.last;
    //     var segundo = first.left;
    //     assertEquals(1, segundo.value);
    //     assertEquals(0, last.value);

    //     assertEquals(first, segundo.left);

    //     assertEquals(segundo, last.left);
    //     assertEquals(last, segundo.left);

    //     assertNull(first.left);
    //     assertNull(last.left);

    // }

    // @Test
    // public void test_remover_lista_vazia() {
    // var lista = new ListaDuplamenteLigada();
    // assertRaises(ListaVaziaErro, lista.remover);

    // }

   @Test public void test_remover_lista_1_elemento() {
    var lista = new ListaDuplamenteLigada();
    lista.add(0);
    assertEquals(0, lista.remove());
    assertEquals(0, lista.tam);
    assertNull(lista.first);
    assertNull(lista.last);

 }

    @Test
    public void test_remover_lista_2_elementos() {
        var lista = new ListaDuplamenteLigada();
        lista.add(0);
        lista.add(1);
        assertEquals(1, lista.remove());
        assertEquals(1, lista.tam);
        var first = lista.first;
        assertEquals(first, lista.last);
        assertEquals(0, first.value);
        assertNull(first.left);
        assertNull(first.left);

    }

    // @Test
    // public void test_remover_lista_3_elementos() {
    //     var lista = new ListaDuplamenteLigada();
    //     lista.add(0);
    //     lista.add(1);
    //     lista.add(2);
    //     assertEquals(2, lista.remove());
    //     assertEquals(2, lista.tam);
    //     var first = lista.first;
    //     var last = lista.last;
    //     assertEquals(last, first.left);
    //     assertEquals(first, last.left);
    //     assertEquals(0, first.value);
    //     assertEquals(1, last.value);
    //     assertNull(first.left);
    //     assertNull(last.left);

    // }

   @Test public void test_removeLeft_lista_1_elemento() {
    var lista = new ListaDuplamenteLigada();
    lista.add(0);
    assertEquals(0, lista.removeLeft());
    assertEquals(0, lista.tam);
    assertNull(lista.first);
    assertNull(lista.last);

 }

   @Test public void test_removeLeft_lista_2_elementos() {
    var lista = new ListaDuplamenteLigada();
    lista.add(0);
    lista.add(1);
    assertEquals(0, lista.removeLeft());
    assertEquals(1, lista.tam);
    var first = lista.first;
    assertEquals(first, lista.last);
    assertEquals(1, first.value);
    assertNull(first.left);
    assertNull(first.left);

 }

    // @Test
    // public void test_removeLeft_lista_3_elementos() {
    //     var lista = new ListaDuplamenteLigada();
    //     lista.add(0);
    //     lista.add(1);
    //     lista.add(2);
    //     assertEquals(0, lista.removeLeft());
    //     assertEquals(2, lista.tam);
    //     var first = lista.first;
    //     var last = lista.last;
    //     assertEquals(last, first.left);
    //     assertEquals(first, last.left);
    //     assertEquals(1, first.value);
    //     assertEquals(2, last.value);
    //     assertNull(first.left);
    //     assertNull(last.left);

    // }

    // @Test public void test_iterar_lista_vazia() {
    // var lista = new ListaDuplamenteLigada();
    // for i in lista:
    // fail('Não deveria executar nada');

    // }

    // @Test public void test_iterar_lista_nao_vazia() {
    // var lista = new ListaDuplamenteLigada();
    // numeros = list(range(3););
    // for n in numeros:
    // lista.add(n);

    // for i, elemento_da_lista in zip(range(3);, lista);:
    // assertEquals(i, elemento_da_lista);

    // }
}