package arrays;

import For.for1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 5;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];

        }
        System.out.println(totalAlunoB / notasAlunoB.length);

        double[] notasAlunoC = new double[4];
        notasAlunoC[0] = 8.6;
        notasAlunoC[1] = 8.9;
        notasAlunoC[2] = 8.8;
        notasAlunoC[3] = 9.9;

        System.out.println(Arrays.toString(notasAlunoC));

        double totalAlunoC = 0;
        for (int i = 0; i < notasAlunoC.length; i++) {
            totalAlunoC += notasAlunoC[i];

        }
        System.out.println(totalAlunoC / notasAlunoC.length);
    }
}
