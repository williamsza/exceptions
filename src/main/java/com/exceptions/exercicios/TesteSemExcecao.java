package com.exceptions.exercicios;

public class TesteSemExcecao {
    public static void main(String[] args) {
        try {
            System.out.println("TRY 1");
            int X = 2 + 2;
            System.out.println("TRY 2");

        } catch (Exception e) {
            System.out.println("CATCH");
        } finally {
            System.out.println("FINALY");
        }
    }
}
