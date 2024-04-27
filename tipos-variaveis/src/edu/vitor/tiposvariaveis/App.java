package edu.vitor.tiposvariaveis;
public class App {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
         // short numeroCurto2 = numeroNormal; 
         // NÃO PODE INVERTER A CONVERSÃO POIS O SHORT SÓ ARMAZENA UMA QUANTIDADE MENOR NUMERICA QUE INT, PORÉM VOCÊ PODE FAZER A CONVERSÃO DA SEGUINTE MANEIRA:
         short numeroCurto2 = (short)numeroNormal;

         // CONSTANTES
         int numeroInicial = 0;
         final int NUMERO_FINAL = numeroInicial;
         System.out.println("O número final é: " + NUMERO_FINAL);
    }
}
