package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" quantas notas:");
        int qtDeNotas = entrada.nextInt();

        double[] notas = new double[qtDeNotas];
        for(int i=0;i <notas.length;i++){
            System.out.println("INFORME SUA NOTA" + (i +1) +";" );
            notas[i]= entrada.nextDouble();
        }
        double total=0;
        for (Double nota:notas){
            total += nota;

        }
        double media = total/notas.length;
        System.out.println(" A media é" + media + "!");




        entrada.close();
    }
}
