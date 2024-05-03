package exe567;
public class ContaEspecial extends Conta {
    public ContaEspecial() {
        super();
    }
    public ContaEspecial(String nome, float salario, String nro, float saldo) {
        super(nome, salario, nro, saldo);
    }
    @Override
    public void setSalario(float salario) {
        this.salario = salario;
        this.setLimite(salario * 3);
    }

    private void setLimite(float limite) {
        this.limite = limite;
    }
}
