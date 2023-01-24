package Switch;

import java.util.Scanner;

public class switchComBreak {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String conceito = "";
        System.out.println("informe a  sua nota ");
        int nota = read.nextInt();
        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 7:
            case 8:
                conceito = "b";
                break;
            case 6:
            case 5:
                conceito = "b";
                break;
            case 4:
            case 3:
                conceito = "c";
                break;
            case 2:
            case 1:
                conceito = "b";
                break;
            case 0:
                conceito = "reprovado";
                break;
            default:
                conceito = "nao informado";
        }
        System.out.println("conceito é " + conceito);
        read.close();
    }
}
