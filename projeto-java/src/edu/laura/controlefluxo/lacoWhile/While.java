package edu.laura.controlefluxo.lacoWhile;

import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantidadeDoces = 0;

        while (mesada > 0){
            quantidadeDoces ++;
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Preço: " + valorDoce);
            mesada -= valorDoce;
        }
        System.out.println("+ MESADA: R$" + mesada);
        System.out.println("+ QUANTIDADE DE DOCES: " + quantidadeDoces);
    }

    //Sorteia números double de 2 a 15
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}