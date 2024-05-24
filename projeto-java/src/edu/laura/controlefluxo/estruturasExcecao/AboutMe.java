package edu.laura.controlefluxo.estruturasExcecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = sc.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.print("Tenho " + idade + " anos ");
            System.out.println("e minha altura é " + altura + " cm.");
            sc.close();
        }
        catch (InputMismatchException e) {
            System.err.println("> Os campos 'idade' e 'altura' NECESSITAM ser numéricos! O campo 'altura' segue o padrão americano de pontuação.");
        }
    }
}
