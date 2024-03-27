package br.com.arvani.tdd;

public class Calculadora {
    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int somar() {
        return a + b;
    }

    public int subtrair() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        return a / b;
    }
}
