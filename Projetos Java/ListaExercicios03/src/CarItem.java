public class CarItem {
    private int id, quantity;
    // Associação todo-parte
    // Product é o objeto parte
    // CarItem é o objeto too
    private Product product;

    public CarItem() {
    }
    // Agregação - Product não depende do CarItem para ser criado

    public CarItem(int id, int quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nID do produto: " + id +
                "\nQuantidade: " + quantity +
                "\n=============================================" +
                "\nDados do produto: " +
                "\n--------------------------" + product;
    }
}
