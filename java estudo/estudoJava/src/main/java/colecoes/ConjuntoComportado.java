package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set <String>listaAprovados = new HashSet<>();
        Set <String>listaAprovados = new TreeSet<>();

        listaAprovados.add("Thiago");
        listaAprovados.add("caio");
        listaAprovados.add("pedri");
        listaAprovados.add("lucas");

        for(String candidatos:listaAprovados){
            System.out.println(candidatos);
        }


    }
}
