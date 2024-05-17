package edu.laura.terminal;

public class AboutMe {
    public static void main(String[] args) {
        //Para que o programa rode pelo terminal da IDE é necessário passar os parametros pelo MODIFY RUN CONFIGURATIONS > PROGRAM ARGUMENTS.
        //Para que rode pelo cmd devemos fazer "java edu.laura.terminal.AboutMe [parametros] [PARAMETROS:. LAURA MARQUES 18 1.75]
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
