package edu.laura.controlefluxo.lacoDoWhile;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("CHAMANDO");
        }
        while (tocando());
        System.out.println("Alô!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
