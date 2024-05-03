package exe5;
public class Conta {
    private String nomeCliente;
    private float salarioCliente;
    private int numeroConta;
    private float saldo;
    private float limite;

    public Conta(String nomeCliente, float salarioCliente, int numeroConta, float limite) {
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        if (limite <= salarioCliente) {
            this.limite = limite;
        } else {
            this.limite = salarioCliente;
        }
    }

    public boolean deposito(float valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean retira(float valor) {
        if (saldo + limite >= valor && valor > 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSalarioCliente() {
        return salarioCliente;
    }

    public void setSalarioCliente(float salarioCliente) {
        this.salarioCliente = salarioCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite <= salarioCliente) {
            this.limite = limite;
        } else {
            this.limite = salarioCliente;
        }
    }
}