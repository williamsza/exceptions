package com.exceptions.exercicios;

public class TesteUnchecked {
    public void metodoX() {
        try {
            throw new ExcecaoChecada("Erro no método X(não checada)");
        } catch (ExcecaoChecada e) {
            throw new RuntimeException(e);
        }
    }

    public void metodoY() {
        metodoX();
    }

    public static void main(String[] args) {
        TesteUnchecked teste = new TesteUnchecked();
        teste.metodoY();
        System.out.println("FIM DO MAIN ");
    }
}
