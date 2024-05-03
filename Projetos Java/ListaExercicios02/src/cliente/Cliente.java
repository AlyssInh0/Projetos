package cliente;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setNroConta (String nroConta) {
        if ((nroConta.length() == 8) && (nroConta.charAt(6) == '-')) {
            this.nroConta = nroConta;
        } else {
            System.out.println("Nro da conta inválido!");
        }
    }

    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6 && nroAgencia.charAt(4) == '-') {
            this.nroAgencia = nroAgencia;
        } else {
            System.out.println("Nro da agência inválido!");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void setSaldo (float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!");
        }
    }

    public String getNroConta() { return nroConta; }
    public String getNroAgencia() { return nroAgencia; }
    public String getNome() { return nome; }
    public float getSaldo() { return saldo; }

    @Override
    public String toString() {
        return "\nCliente:" +
                "\nNúmero da conta: " + nroConta +
                "\nNúmero da agência: " + nroAgencia +
                "\nNome: " + nome +
                "\nSaldo: " + saldo;
    }

    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }
    public void depositar(float x) {
        this.setSaldo(this.saldo + x);
    }
    public void exibeErro (String mensagem) {
        System.out.println(mensagem);
    }
}