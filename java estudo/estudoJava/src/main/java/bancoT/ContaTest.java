package bancoT;

import colecoes.Lista;
import colecoes.Usuario;

import java.util.ArrayList;

public class ContaTest {
    public static void main(String[] args) {
        ArrayList <Conta>list = new ArrayList<>();
        Conta c1 = new Conta("thiago",64646, "thiago@gtk.com.br ");

        Conta c2= new Conta( "thiago ",22222222,"thiago@kfkfkfk");
        list.add(new Conta("lucas ", 33333333, " DNDNDNDHJJ@B CHJDJDHJ"));
        list.add(new Conta("pedro",22222,"THIAGO BDJDDJ@  FJFHDFJ"));
        for (Conta c:list){
            System.out.println("  nome "+ c1.getNome() +   " CPF: " + c1.getCpf());
            System.out.println("  nome "+ c2.getNome() +   " CPF: " + c2.getCpf());



        }



    }



}
