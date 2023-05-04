package oo.Herança;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;


        Boss boss = new Boss();
        boss.x = 10;
        boss.y = 11;
        System.out.println("heroi tem=>" + heroi.vida);
        System.out.println("boss tem=>" + boss.vida);


        heroi.atacar(boss);
        boss.atacar(heroi);
        System.out.println("heroi tem=>" + heroi.vida);
        System.out.println("boss tem=>" + boss.vida);


    }
}
