package edu.laura.controlefluxo.estruturacondicionais;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Plano desejado [T/M/B]: ");
        char plano = sc.next().charAt(0);
        //Para usarmos CHAR precisamos adicionar chatAt para que o programa reconheça a primeira letra como entrada.
        switch (plano){
            case 'T': {
                System.out.println(" + 5GB YOUTUBE");
            }
            case 'M': {
                System.out.println(" + WHATSAPP E INSTAGRAM ILIMITADOS");
            }
            case 'B': {
                System.out.println(" + 100 MINUTOS DE LIGAÇÃO");
                break;
            }
            default:
                System.out.println(" 😥 PLANO INEXISTENTE!");
        }
    }
}
