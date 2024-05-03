package exe7;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        Cartao cartao = new Cartao(conta, "senha123");

        System.out.println("Saldo atual: $" + cartao.saldo("senha123"));
        cartao.retirada(100, "senha123");
        System.out.println("Saldo após retirada: $" + cartao.saldo("senha123"));

        cartao.alterarSenha("senha123", "novaSenha456");
        cartao.retirada(100, "senha123"); // Tentando usar a senha antiga
    }
}