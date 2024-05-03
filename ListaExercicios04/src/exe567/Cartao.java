package exe567;
public class Cartao {
    private int senha, nro;
    private Conta conta;

    public Cartao() {
    }

    public Cartao(int senha, int nro, Conta conta) {
        this.senha = senha;
        this.nro = nro;
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "senha=" + senha +
                ", nro=" + nro +
                ", conta=" + conta +
                '}';
    }
    public void depositar(float d, int senha) {
        if (senha == this.senha) {
            this.conta.depositar(d);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Senha incorreta");
        }
    }

    public boolean sacar(float s, int senha) {
        if (senha == this.senha) {
            if (this.conta.sacar(s)) {
                System.out.println("Saque realizado com sucesso");
                return true;
            } else {
                System.out.println("Saldo insuficiente");
                return false;
            }
        } else {
            System.out.println("Senha inválida");
            return false;
        }
    }
    public void trocarSenha(int senhaAtual, int senhaNova) {
        if (senhaAtual == this.senha) {
            this.senha = senhaNova;
            System.out.println("Senha alterada");
        } else {
            System.out.println("Senha atual inválida");
        }
    }
}
