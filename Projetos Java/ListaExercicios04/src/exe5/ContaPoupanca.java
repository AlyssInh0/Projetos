package exe5;
public class ContaPoupanca extends Conta {
    private float taxaRendimento;

    public ContaPoupanca(String nomeCliente, float salarioCliente, int numeroConta, float limite, float taxaRendimento) {
        super(nomeCliente, salarioCliente, numeroConta, limite);
        this.taxaRendimento = taxaRendimento;
    }

    public void rendimentoMensal() {
        deposito(getSaldo() * taxaRendimento);
    }
}
