package edu.vitor.condicionalemvariavel;

public class App {
    public static void main(String[] args) {
        String nome = "Claudio";
        String nomeDois = new String("Claudio");

        boolean igualFalse = nome == nomeDois; // Resultado false porque nomeDois é objeto
        boolean igualTrue = nome.equals(nomeDois); // Resultado true porque o metodo equals compara o conteudo do objeto com a variavel
        System.out.println("Variavel igualFalse: "+igualFalse);
        System.out.println("Variavel igualTrue: "+igualTrue);
    }
}
