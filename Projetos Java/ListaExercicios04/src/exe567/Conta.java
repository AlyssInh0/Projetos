package exe567;
public class Conta {
    protected String nome, nro;
    protected float salario, saldo, limite;

    public Conta() {
    }

    public Conta(String nome, float salario, String nro, float saldo) {
        this.setNome(nome);
        this.setNro(nro);
        this.setSalario(salario);
        this.setSaldo(saldo);
    }
    public void depositar(float d) {
        this.saldo += d;
    }
    public boolean sacar(float s) {
        if ((this.saldo + this.limite) >= s) {
            this.saldo -= s;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        this.setLimite(salario);
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    private void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", nro='" + nro + '\'' +
                ", salario=" + salario +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}