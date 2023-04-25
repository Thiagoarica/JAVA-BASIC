package classes;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome= "pedro";
        u1.email= "pedromestre@mestegmail.com";

        Usuario u2= new Usuario();
        u2.nome= "THIAGO";
        u2.email= "thiago@mestegmail.com";

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
