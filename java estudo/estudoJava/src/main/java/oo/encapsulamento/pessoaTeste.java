package oo.encapsulamento;

public class pessoaTeste {
    public static void main(String[] args) {



        Pessoa p1= new Pessoa();
        p1.setNome("thiago");// alterar
        System.out.println(p1.getNome());

        p1.setIdade(30);//alterar
        System.out.println(p1.getIdade());// ler


    }
}
