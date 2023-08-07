package com.ed.ed.aula6;

public class Noh {

    public int value;
    public Noh left;
    public Noh right;

    public Noh(int value) {
        this.value = value;
    }

    public Noh(int value, Noh left) {
        this.value = value;
        this.left = left;
    }

    public Noh(int value, Noh left, Noh right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
