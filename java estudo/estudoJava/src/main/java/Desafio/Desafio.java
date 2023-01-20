package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o numero da semana");
        String nome = entrada.nextLine();
        if (nome.equalsIgnoreCase("domingo")) {
            System.out.println(1);

        }else {
            if (nome.equalsIgnoreCase("segunda")) {
                System.out.println(2);
            }else if (nome.equalsIgnoreCase("terca")||nome.equalsIgnoreCase("terça")) {
                System.out.println("3");
            } else if (nome.equalsIgnoreCase("quarta") ) {
                System.out.println("4 ");
            } else if (nome.equalsIgnoreCase("quinta")) {
                System.out.println("5");

            } else if (nome.equalsIgnoreCase("sexta")) {
                System.out.println(" 6");
            } else if (nome.equalsIgnoreCase("sabado")) {
                System.out.println("7");
            } else
                System.out.println("dia digitado invalido ");



        }
        System.out.println(" fim ");
        entrada.close();
    }

}



