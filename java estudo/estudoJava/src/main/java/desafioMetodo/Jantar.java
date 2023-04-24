package desafioMetodo;

public class Jantar {
    public static void main(String[] args) {

        Comida c1= new Comida("Arroz",0.180);
        Comida C2 = new Comida("FEIJAO", 0.300 );

        Pessoa p1 = new Pessoa("PEDRO",89.8);
        System.out.println(p1.apresentar());

        p1.comer(c1);

    }
}
