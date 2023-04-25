package colecoes;

import java.sql.Array;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario>lista=new ArrayList<>();
        Usuario u1 =new Usuario("roberval");
        lista.add(u1);
        lista.add(new Usuario("carlos"));
        lista.add(new Usuario("lucas "));
        lista.add(new Usuario("pedro"));
        for (Usuario u:lista){
            System.out.println(u.nome);
        }


    }
}
