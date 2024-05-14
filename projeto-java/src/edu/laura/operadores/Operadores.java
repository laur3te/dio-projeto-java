package edu.laura.operadores;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        System.out.println("-- Operador '+' e concatenação --");

        concatenacao = 1+1+1+"1";
        System.out.println("> 1 + 1 + 1 + \"1\" = " + concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("> \"1\" + 1 + 1 + 1 + 1 = " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("> 1 + \"1\" + 1 + 1 = " + concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("> 1 + \"1\" + 1 + \"1\" = "+ concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("> \"1\" + (1 + 1 + 1) = " + concatenacao);
    }
}
