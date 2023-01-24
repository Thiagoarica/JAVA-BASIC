package Switch;

import java.util.Scanner;

public class switchSemBreak {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String faixa = "branco";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println(" mestre miagi ");
            case "roxo":
                System.out.println(" chegando la  ");
            case "marrom  ":
                System.out.println("sufoco ");
            case "laranja ":
                System.out.println(" se ta doido ");
            case "amarela ":
                System.out.println(" evoluindo  ");
            default :
                System.out.println(" junino   ");

        }

    }
}
