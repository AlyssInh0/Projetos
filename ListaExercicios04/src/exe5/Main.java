package exe5;
public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("João", 3000, 123456, 500, 0.02f);
        Conta contaPoupanca = new ContaPoupanca("Maria", 2000, 654321, 1000, 0.05f);

        contaCorrente.deposito(1000);
        contaCorrente.retira(500);
        contaPoupanca.deposito(500);
        contaPoupanca.retira(200);

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());

        Conta outraConta = new ContaCorrente("Fernanda", 4000, 987654, 700, 0.03f);
        outraConta.deposito(1500);
        outraConta.retira(200);
        System.out.println("Saldo da outra conta (corrente): " + outraConta.getSaldo());
    }
}