package edu.laura.operadores;

public class Operadores5 {
    public static void main(String[] args) {
        System.out.println("-- Comparação --");
        int num1 = 3;
        int num2 = 5;
        String nomeUm = "GABRIEL";
        String nomeDois = new String("GABRIEL");

        boolean simNao = num1 == num2;
        //.equals() compara objetos
        System.out.println(nomeUm.equals(nomeDois));

        simNao = num1 != num2;
        // == para números
        System.out.println("O 1° número é diferente do 2°? " + simNao);

        simNao = num1 >= num2;
        System.out.println("O 1° número é menor que o 2°? " + simNao);
    }
}
