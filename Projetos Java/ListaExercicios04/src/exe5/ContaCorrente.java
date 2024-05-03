package exe5;
public class ContaCorrente extends Conta {
    private float taxaOperacao;

    public ContaCorrente(String nomeCliente, float salarioCliente, int numeroConta, float limite, float taxaOperacao) {
        super(nomeCliente, salarioCliente, numeroConta, limite);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public boolean retira(float valor) {
        float taxa = valor * taxaOperacao;
        return super.retira(valor + taxa);
    }
}
