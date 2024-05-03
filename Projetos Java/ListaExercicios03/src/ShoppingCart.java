import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private final List<CarItem> carItens; // Lista de CarItem
    public ShoppingCart() {
        // Aloca espaço na memória antes de  adicionar elementos
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, float totalPrice) {
        this.setId(id);
        this.setTotalPrice(totalPrice);
        // Aloca espaço na memória antes de  adicionar elementos
        this.carItens = new ArrayList<CarItem>();
    }

    // Composição
    // O CarItem é criado dentro do ShoppingCart
    public void addCarItem(int id, int quantity, Product product) {
        this.carItens.add(new CarItem(id, quantity, product));
        this.calculateTotalPrice();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public List<CarItem> getCarItem() {
        return carItens;
    }

    public void calculateTotalPrice() {
        this.totalPrice = 0;
            for(CarItem obj: carItens) { // Percorre vetor carItens
                totalPrice += obj.getQuantity() * obj.getProduct().getPrice();
            }
    }

    @Override
    public String toString() {
        return "\nCarrinho de compras: " +
                "\n--------------------------" +
                "\nID: " + id +
                "\nPreço total da compra: " + totalPrice +
                "\n=============================================" +
                "\nItens do carrinho: " + carItens;
    }
}