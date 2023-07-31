package com.ed.ed.aula2;

public class Potencia {

    // O(n)
    public int execute(int base, int exp) {
        return recursion(base, exp, base);
    }

    private int recursion(int base, int exp, int result) {
        if (exp == 0)
            return result;

        return recursion(base, exp - 1, result * base);
    }

    public int log(int base, int exp) {
        return logEx(base, exp, 1);
    }

    private int logEx(int base, int exp, int result) {
        if (exp == 0)
            return 0;

        if (exp % 2 == 0) {
            return logEx(base * base, exp / 2, result);
        } else {
            result *= base;
            return logEx(base, exp - 1, result);
        }
    }

}
