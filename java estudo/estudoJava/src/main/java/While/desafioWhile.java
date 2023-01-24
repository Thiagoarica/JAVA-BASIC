package While;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        float nota = 0, total = 0, media = 0;
        int notasValidas = 0;
        while (nota >=0 || nota <= 10){//verificar se funciona
            System.out.print("Digite a nota (ou -1 para sair): ");
            nota = read.nextFloat();
            if(nota >= 0 && nota <= 10){
                total += nota;
                notasValidas++;
            } else if (nota == -1){
                media = total/notasValidas;
                System.out.printf("A média das notas é = %.2f", media);
                System.out.println("\nForam digitadas " + notasValidas + " notas válidas");
                break;
            }
        }

    }
}
