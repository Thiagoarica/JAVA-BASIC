package Continue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;

            }
            System.out.println(i);

        }
    }
}
