package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado =new Pessoa(99.65);
        Arroz alimentacao1=new Arroz(5);
        Feijao alimentacao2 =new Feijao(3);
        Sorvete sobremesa = new Sorvete(3);

        System.out.println(convidado.getPeso());

        convidado.comer(alimentacao1);
        convidado.comer(alimentacao2);
        System.out.println(convidado.getPeso());
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
