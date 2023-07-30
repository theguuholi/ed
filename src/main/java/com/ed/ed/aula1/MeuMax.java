package com.ed.ed.aula1;

import java.util.List;

public class MeuMax {

    public int meuMax(List<Integer> iteravel) {
        // f(n)+ 2 + 4*n => O(n)
        int numeroMaximo = Integer.MIN_VALUE; // #1
        for (int numero : iteravel) { // #1
            if (numero > numeroMaximo) { // # 1
                numeroMaximo = numero;
                ; // #1
            }
        }
        return numeroMaximo; // #1
    }
}