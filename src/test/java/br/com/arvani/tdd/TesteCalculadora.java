package br.com.arvani.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCalculadora {
    
    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora(2, 3);
        assertEquals(5, calculadora.somar());   
    }

    @Test
    public void testSubtrair(){
        Calculadora calculadora = new Calculadora(2, 3);
        assertEquals(-1, calculadora.subtrair());
    }

    @Test
    public void testMultiplicar(){
        Calculadora calculadora = new Calculadora(2, 3);
        assertEquals(6, calculadora.multiplicar());
    }

    @Test
    public void testDividir(){
        Calculadora calculadora = new Calculadora(6, 3);
        assertEquals(2, calculadora.dividir());
    }
}
