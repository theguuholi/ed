package com.ed.ed.aula2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PotenciaTest {

    @Test
    public void test1() {
        int execute = new Potencia().execute(2, 10);
        assertEquals(execute, 2048);
    }

    //     @Test
    // public void test2() {
    //     int execute = new Potencia().log(2, 5);
    //     assertEquals(execute, 2048);
    // }
}
