package For;

public class For2 {
    public static void main (String[] args){
        //Este laço ira fazer a contagem de 10 até ZERO diminuindo de 2 em 2
        for (int i = 10; i >= 0; i -= 2){
            System.out.println("I = " + i);
        }
//Este laço ira gerar uma matriz 9x9 imprimindo [0 0] [0 1]...
        for (int a = 0; a < 10; a++){
            for (int b = 0; b < 10; b++){
                System.out.printf("[%d %d]", a, b);
            }
            System.out.println();
        }
    }
}












