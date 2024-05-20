package edu.laura.controlefluxo.estruturacondicionais;

public class EstruturasCondicionaisSimples {
    public static void main(String[] args) {
        //Exemplo de estrutura condicional simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }
        System.out.println(saldo);
    }
}
