package edu.laura.anatomiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Laura"; //Primeiro nome
        String lastName = "Oliveira"; //Último nome

        String fullName = fullName(firstName, lastName); //O nome inteiro é composto por uma chamada de método
        System.out.println(fullName); //Printa o nome
    }
    public static String fullName(String firstName, String lastName) {
        return "Resultado do método: " + firstName.concat(" ").concat(lastName);
        //É necessário a criação desse método para separar o primeiro nome do último e para mostrar como funcionar um retorno de método.
        //O primeiro nome está concatenado com o espaço e com o segundo nome, gerando assim o resultado esperado.
        //Informar os típos de parametro e separá-los por vírgulas.
    }
}

