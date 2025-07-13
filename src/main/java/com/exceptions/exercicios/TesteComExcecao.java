package com.exceptions.exercicios;

public class TesteComExcecao {
    public static void main(String[] args) {
        try {
            System.out.println("TRY 1");
            int X = 10 / 0;
            System.out.println("TRY 2");
        } catch (ArithmeticException e){
            System.out.println("CATCH ");
        } finally {
            System.out.println("FINALY");
        }
    }
}
