package edu.vitor.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Jorge";
        String sobreNome = "Claudio";
        String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome,String sobreNome){
        return primeiroNome.concat(" ").concat(sobreNome);
    }
}
