package While;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String valor = "" ;
  // enquanto o usuario nao digitar  sair vai continuar while ativo
        while (!valor.equalsIgnoreCase("sair" )) {
            System.out.println("digite ");
            valor = read.nextLine();
        }
        read.close();

    }

}
