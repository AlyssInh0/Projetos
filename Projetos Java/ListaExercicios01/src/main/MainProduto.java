package main;
import produto.Produto;
public class MainProduto {
    public static void main(String[] args) {
        Produto obj = new Produto(1, 10, "Copo americano", 2.00f);
        System.out.println(obj.mostra());

        obj.estoque();
        obj.subirPreco();
        System.out.println(obj.mostra1());

        obj.descerPreco();
        System.out.println(obj.mostra2());
    }
}
