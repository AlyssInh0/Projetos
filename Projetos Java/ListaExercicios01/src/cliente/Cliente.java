package cliente;
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public float saldo;
    public Cliente(){

    }

    public Cliente(int nroConta, int nroAgencia, String nome, float saldo) {
        this.nroConta = nroConta; this.nroAgencia = nroAgencia;
        this.nome = nome; this.saldo = saldo;
    }

    public void depositar(float x) {
        this.saldo += x;
    }

    public void sacar(float x) {
        if (this.saldo - x >= 0) {
            this.saldo -= x;
        }
    }

    public String mostra() {
        return "\nNúmero da conta: " + this.nroConta + "\nNúmero da agência: " + this.nroAgencia +
                "\nNome: " + this.nome + "\nSaldo: " + this.saldo;
    }

    public void saldoFinal() {
        this.depositar(250);
        this.sacar(450);

        System.out.println("Saldo após depósito e saque: R$ " + this.saldo);
    }
}
