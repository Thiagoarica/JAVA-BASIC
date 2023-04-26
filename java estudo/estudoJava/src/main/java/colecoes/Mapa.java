package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer,String>usuario= new HashMap<>();
        usuario.put(1,"roberto");
        usuario.put(2,"fabio");
        System.out.println(usuario.size());
        System.out.println(usuario.entrySet());
    }
}
