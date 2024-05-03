public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Sabonete", 6.8f, 1);
        Product product2 = new Product("Bexiga", 3.0f, 2);

        /*
            CarItem carItem1 = new CarItem(10, 100, product1);
            CarItem carItem2 = new CarItem(11, 50, product1);
            CarItem carItem3 = new CarItem(12, 60, product2);

            System.out.println(carItem1.toString());
            System.out.println(carItem2.toString());
            System.out.println(carItem3.toString());
        */

        ShoppingCart shoppingCart1 = new ShoppingCart(1001, 0);
        shoppingCart1.addCarItem(10, 100, product1);
        shoppingCart1.addCarItem(11, 50, product2);
        System.out.println(shoppingCart1.toString());
    }
}