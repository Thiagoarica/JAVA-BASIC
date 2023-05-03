package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
   final List<Item> items = new ArrayList<>();
    void getItem(Produto p, int quantidade){
        this.items.add(new Item(p,quantidade));

    }
    void getItem(String nome,double preco, int quantidade){
        var produto =new Produto(nome,quantidade);
        this.items.add(new Item( new Produto(nome,preco),quantidade));

    }
    double getvalorTotal(){
        double total=0;

        for (Item item: items){
            total += item.quantidade*item.produto.preco;
        }
            return total;
    }
}
