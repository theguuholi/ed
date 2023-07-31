package com.ed.ed.aula2;

public class TorreDeHanoi {
    private int call = 0;

    // f(n) = 1 + 2 * f(n-1)
    public void execute(int discNumbers) {
        hannoiRecursion(discNumbers, "A", "B", "C");
        System.out.println(call);
    }

    private void hannoiRecursion(int discNumbers, String origin, String dest, String aux) {
        call++;
        if (discNumbers == 1) {
            System.out.println(origin + " => " + dest + " : " + discNumbers);
            return;
        }
        hannoiRecursion(discNumbers - 1, origin, aux, dest);
        System.out.println(origin + " => " + dest + " : " + discNumbers);
        hannoiRecursion(discNumbers - 1, aux, dest, origin);

    }

}
