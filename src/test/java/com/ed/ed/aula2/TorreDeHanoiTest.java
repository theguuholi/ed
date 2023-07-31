package com.ed.ed.aula2;

import org.junit.jupiter.api.Test;

public class TorreDeHanoiTest {

    @Test
    public void shouldReturnWhenIsOne() {
        int i = 1;
        System.out.println("Torre de Hanoi para " + i + " discos");
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        torreDeHanoi.execute(i);
    }

    @Test
    public void shouldReturnWhenIsTwo() {
        int i = 2;
        System.out.println("Torre de Hanoi para " + i + " discos");
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        torreDeHanoi.execute(i);
    }

    @Test
    public void shouldReturnWhenIsThree() {
        int i = 3;
        System.out.println("Torre de Hanoi para " + i + " discos");
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        torreDeHanoi.execute(i);
    }
}
