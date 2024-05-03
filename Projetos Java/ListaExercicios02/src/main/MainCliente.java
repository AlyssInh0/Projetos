package main;
import cliente.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj = new Cliente();
        obj.setNroConta("123456-8");
        obj.setNroAgencia("1234-6");
        obj.setNome("Fulano");
        obj.setSaldo(300);
        obj.depositar(500);
        obj.sacar(200);
        System.out.println(obj.toString());

        Cliente obj1 = new Cliente("234567-8", "2345-7", "Beltrano", 0);
        obj1.depositar(9000);
        obj1.sacar(3000);
        System.out.println(obj1.toString());
    }
}