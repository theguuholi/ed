package com.ed.ed.aula8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalancearTest {

    @Test
    public void testExpressaoVazia() {
        assertTrue(new Balancear().estaBalanceada(""));
    }

    @Test
    public void testParenteses() {
        assertTrue(new Balancear().estaBalanceada("()"));
    }

    @Test
    public void testChaves() {
        assertTrue(new Balancear().estaBalanceada("{}"));
    }

    @Test
    public void testColchetes() {
        assertTrue(new Balancear().estaBalanceada("[]"));
    }

    @Test
    public void testTodosCaracteres() {
        assertTrue(new Balancear().estaBalanceada("({[]})"));
        assertTrue(new Balancear().estaBalanceada("[({})]"));
        assertTrue(new Balancear().estaBalanceada("{[()]}"));
    }

    @Test
    public void testChaveNaoFechada() {
        assertFalse(new Balancear().estaBalanceada("{"));
    }

    @Test
    public void testColcheteNaoFechado() {
        assertFalse(new Balancear().estaBalanceada("["));
    }

    @Test
    public void testParenteseNaoFechado() {
        assertFalse(new Balancear().estaBalanceada("("));
    }

    @Test
    public void testChaveNaoAberta() {
        assertFalse(new Balancear().estaBalanceada("}{"));
    }

    @Test
    public void testColcheteNaoAberto() {
        assertFalse(new Balancear().estaBalanceada("]["));
    }

    @Test
    public void testParenteseNaoAberto() {
        assertFalse(new Balancear().estaBalanceada(")("));
    }

    @Test
    public void testFaltaDeCaracterDeFechamento() {
        assertFalse(new Balancear().estaBalanceada("({[]}"));
    }

    @Test
    public void testFaltaDeCaracterDeAbertura() {
        assertFalse(new Balancear().estaBalanceada("({]})"));
    }

    @Test
    public void testExpressaoMatematicaValida() {
        assertTrue(new Balancear().estaBalanceada("({[1+3]*5}/7)+9"));
    }

    @Test
    public void testCharErradoFechando() {
        assertFalse(new Balancear().estaBalanceada("[)"));
    }

    private boolean new Balancear().estaBalanceada(String expressao) {
        // Implement your logic here to check if the expression is balanced
        return false; // Replace with actual implementation
    }
}
