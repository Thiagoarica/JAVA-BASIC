package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto= new HashSet();

        //add no conjunto

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("tamanho é "+ conjunto.size());
        // remover
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("x"));

        System.out.println("tamanho é "+ conjunto.size());
        //consultar

        System.out.println(conjunto.contains("x "));

        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums= new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
