package edu.laura.operadores;

public class Operadores6 {
    public static void main(String[] args) {
        System.out.println("-- Operadores Lógicos --");

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras.");
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("Fim");
    }
}
