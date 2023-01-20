package Programa.nota.controller;

import java.util.Scanner;

public class MediaIFElse {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("digita a sua nota ");
        double nota= entrada.nextDouble();
        if (nota >10 || nota < 0) {
            System.out.println("nota invalida ");

        }else {
            if (nota >= 8.1) {
                System.out.println(" conceito A ");
            }else if (nota>= 6.1) {
                    System.out.println("conceito B");
                } else if (nota>= 4.1) {
                    System.out.println("conceito C");
                } else if (nota>= 3.1) {
                System.out.println("conceito D ");

            } else if (nota>= 3.1) {
                System.out.println("conceito D ");
            } else if (nota <= 0) {
                System.out.println("pode desistir");
            }


        }
        System.out.println(" fim ");
        entrada.close();
    }

}
