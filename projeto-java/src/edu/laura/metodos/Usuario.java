package edu.laura.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv minhaTV = new SmartTv();

        System.out.println("Qual canal atual? " + minhaTV.canal);
        System.out.println("A TV está ligada? " + minhaTV.ligada);
        System.out.println("Qual volume atual? " + minhaTV.volume);
        System.out.println("- - - - - - - - -");

        minhaTV.diminuirVolume();
        minhaTV.diminuirVolume();
        minhaTV.diminuirVolume();
        minhaTV.aumentarVolume();
        System.out.println("- - - - - - - - -");

        minhaTV.mudarCanal(13);
        System.out.println("Qual canal atual? " + minhaTV.canal);
        System.out.println("- - - - - - - - -");

        minhaTV.desligar();
        System.out.println("A TV está desligada? " + minhaTV.ligada);

    }
}