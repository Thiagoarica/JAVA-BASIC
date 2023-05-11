package oo.abstrata;

public class TestAbstrato {
    public static void main(String[] args) {
        Animal a=new Cachorro();
        a.mover();
        System.out.println(a.mover());
    }

}
