package com.ed.ed.aula1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MeuMaxTest {

    @Test
    public void retornaNumeroMaximo() {

        List<Integer> iteravel = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            iteravel.add(i);
        }

        Instant start = Instant.now();

        int meuMax = new MeuMax().meuMax(iteravel);
        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);

        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");

        assertEquals(99999, meuMax);
    }
}
