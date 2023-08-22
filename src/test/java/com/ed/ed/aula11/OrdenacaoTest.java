package com.ed.ed.aula11;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class OrdenacaoTest {
    private SelectionSort ordenar = new SelectionSort();

    @Test
    public void testListaVazia() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, ordenar.ordenar(input));
    }

    @Test
    public void testListaUnitaria() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, ordenar.ordenar(input));
    }

    @Test
    public void testListaBinaria() {
        int[] input = {2, 1};
        int[] expected = {1, 2};
        assertArrayEquals(expected, ordenar.ordenar(input));
    }

    @Test
    public void testListaDesordenada() {
        int[] input = {9, 7, 1, 8, 5, 3, 6, 4, 2, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, ordenar.ordenar(input));
    }
}
