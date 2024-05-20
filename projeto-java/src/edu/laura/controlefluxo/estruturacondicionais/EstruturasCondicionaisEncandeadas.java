package edu.laura.controlefluxo.estruturacondicionais;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionaisEncandeadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else if (nota >= 5){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
