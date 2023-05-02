package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1= new Compra();
        c1.cliente="pedro master";
        c1.itens.add(new Item("CANETA ",20,7.75));
        c1.itens.add(new Item("BORACHA ",20,5.75));
        c1.itens.add(new Item("CADERNO",40,9.75));
        System.out.println(c1.itens.size());
        System.out.println(c1.getvalorTotal());
    }
}
