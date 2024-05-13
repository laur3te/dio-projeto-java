package edu.laura.anatomiaclasses;

public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaFinal = 10; //Quando definido previamente a IDE já analisa e aponta quais condições seram falsas, por isso a ausência de cor.
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
