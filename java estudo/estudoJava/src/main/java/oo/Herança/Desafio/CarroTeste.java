package oo.Herança.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        System.out.println("bem vindo a cidade  das maquinas" );
        Carro ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.desligarTurbo();


        System.out.println(ferrari);


        Carro fusca = new Fusca();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.frear();
        System.out.println(fusca);





    }
}
