package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String>livros = new ArrayDeque<>();
        livros.add("o pequeno principe");
        livros.push("matrix");
        System.out.println(livros.pop());
        
    }
}
