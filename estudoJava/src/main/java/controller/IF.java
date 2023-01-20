package controller;


import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a media ");
        double media = entrada.nextDouble();
        // condicao
        if ( media <= 10 && media>= 7.0){
            System.out.println("aprovado vem com pai ");
        System.out.println("parabens ");
    }
        if (media < 7 && media>=4.5) {
            System.out.println(" reprovado tente recuperar ");
        }
        if (media < 4.5 && media>=0){
            System.out.println("estudar mais ");
        }
        entrada.close();

    }
}
