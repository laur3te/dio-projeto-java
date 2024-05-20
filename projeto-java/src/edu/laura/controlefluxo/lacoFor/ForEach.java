package edu.laura.controlefluxo.lacoFor;

public class ForEach {
    public static void main(String[] args) {
        String animais [] = {"GAIVOTA", "BORBOLETA", "POMBO", "KIWI", "TUCANO"};

        for (String animal : animais){
            System.out.println("O animal da vez é " + animal);
        }
    }
}
