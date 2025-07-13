package com.exceptions.exercicios;

public class TesteChecked {
    public void metodoX() throws ExcecaoChecada {
        throw new ExcecaoChecada("Erro no metodoX. ");

    }

    public void metodoY() throws ExcecaoChecada {
        metodoX();

    }

    public static void main(String[] args) {
        TesteChecked teste = new TesteChecked();
        try {
            teste.metodoY();
        } catch (ExcecaoChecada e) {
            System.out.println("Peguei exceção checada: " + e.getMessage());

        }
    }
}
