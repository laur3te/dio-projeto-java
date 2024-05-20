package edu.laura.controlefluxo.estruturacondicionais;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionaisTernarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe sua nota: ");
        double nota = sc.nextDouble();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }
}
