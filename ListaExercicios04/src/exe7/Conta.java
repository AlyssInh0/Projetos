package exe7;
public class Conta {
    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void retirada(float valor) {
        saldo -= valor;
    }
}