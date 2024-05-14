package edu.laura.metodos;

public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 20;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCana(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
