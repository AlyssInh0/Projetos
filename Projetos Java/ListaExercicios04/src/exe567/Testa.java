package exe567;

public class Testa {
    public static void main(String[] args) {
        Conta objConta = new Conta("Fulano", 3000, "123-x", 0);
        System.out.println(objConta.toString());

        ContaEspecial objContaEspecial = new ContaEspecial("Beltrano", 3000, "456-x", 0);
        System.out.println(objContaEspecial.toString());
    }
}