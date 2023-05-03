package oo.composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {


        Compra compra1= new Compra();
        compra1.getItem("caneta", 9.86,10);
        compra1.getItem(new Produto("PC",3.000),2);

        Compra compra2= new Compra();
        compra2.getItem("caderno", 9.86,10);
        compra2.getItem(new Produto("Mac",6.000),2);

        Cliente cliente= new Cliente("PEDRO");
         cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.getvalorTotal());




    }
}
