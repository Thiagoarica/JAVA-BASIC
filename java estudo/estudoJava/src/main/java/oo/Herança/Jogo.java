package oo.Herança;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("bom dia meu nome nao me lembro, acordei nas terras sombrias: ");
        Scanner head =new Scanner(System.in);
        System.out.println("qual meu nome  ?");
        String personagem=head.nextLine();;
        System.out.println("bem vindo" + " "  +  personagem  +  " " + "vamos emfrentar o primeiro boss" );
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;


        Boss boss = new Boss();
        boss.x = 10;
        boss.y = 11;
        System.out.println("heroi foi atacado , porem revida =>" + heroi.vida);
        System.out.println("boss tem=>" + boss.vida);


        heroi.atacar(boss);
        boss.atacar(heroi);
        heroi.atacar(boss);
        System.out.println("heroi tem=>" + heroi.vida);
        System.out.println("boss foi atingido pelo revide =>" + boss.vida);


    }
}
