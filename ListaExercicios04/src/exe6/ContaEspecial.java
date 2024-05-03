package exe6;
import exe5.Conta;

class ContaEspecial extends Conta {

    public ContaEspecial(String nomeCliente, float salarioCliente, int numeroConta, float limite) {
        super(nomeCliente, salarioCliente, numeroConta, limite);
    }

    @Override
    public void setLimite(float limite) {
        if (limite <= 3 * getSalarioCliente()) {
            super.setLimite(limite);
        } else {
            super.setLimite(3 * getSalarioCliente());
        }
    }
}