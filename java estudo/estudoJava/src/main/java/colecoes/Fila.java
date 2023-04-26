package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila=new LinkedList<>();
        fila.add("ana");
        fila.offer("roterd");
        fila.add("lucas");
        fila.offer("pietran");
        fila.add("louter");
        fila.offer("couter");
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

    }
}
