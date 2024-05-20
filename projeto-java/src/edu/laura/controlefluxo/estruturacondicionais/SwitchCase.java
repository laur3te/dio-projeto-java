package edu.laura.controlefluxo.estruturacondicionais;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o tamanho da roupa: ");
        String tamanho = sc.next();

        switch (tamanho){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("DADO INDEFINIDO");
        }
    }
}
