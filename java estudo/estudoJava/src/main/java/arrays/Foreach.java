package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[]notas={4.9,5.7,5,6};

        for (int i=0;i <notas.length;i++){
            System.out.println(notas[i]+ " ");
        }
        // Foreach
        for(double nota:notas){
            System.out.println(nota + " ");

        }
    }
}
