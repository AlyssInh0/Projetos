package produto;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
    public Produto() {

    }
    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x) {
        this.qtde += x;
    }
    public void vender(int x) {
        if (this.qtde - x >= 0)
            this.qtde -= x;
    }
    public void subir (float x) {
        this.preco += x;
    }

    public void descer (float x) {
        if (this.preco - x >= 0)
            this.preco -= x;
    }

    public String mostra() {
        return "\nID do produto: " + this.id + "\nQuantidade em estoque: " + this.qtde + "\nDescrição: " +
                this.descricao + "\nPreço do produto: " + this.preco;
    }

    public void estoque() {
        this.comprar(5);
        this.vender(10);
    }

    public void subirPreco() {
        this.subir(5);
    }

    public void descerPreco() {
        this.descer(2);
    }

    public String mostra1() {
        return "\nQuantidade de itens no estoque após compra e venda: " + this.qtde +
                "\nPreço do produto para 5 unidades: " + this.preco;
    }

    public String mostra2() {
        return "Preço do produto para 2 unidades: " + this.preco;
    }
}
