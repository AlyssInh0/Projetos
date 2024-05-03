package main;
import cliente.Cliente;
public class MainCliente {
    public static void main(String[] args) {
        Cliente obj = new Cliente(14404, 1234, "Fulano", 1500.00f);
        System.out.println(obj.mostra());

        obj.saldoFinal();
    }
}
