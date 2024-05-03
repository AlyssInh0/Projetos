package exe7;
public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public double saldo(String senha) {
        if (this.senha.equals(senha)) {
            return conta.getSaldo();
        } else {
            System.out.println("Senha incorreta");
            return -1; // ou lançar uma exceção, dependendo do requisito
        }
    }

    public void retirada(float valor, String senha) {
        if (this.senha.equals(senha)) {
            conta.retirada(valor);
            System.out.println("Retirada de $" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Senha incorreta. Não é possível realizar a retirada.");
        }
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = senhaNova;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha antiga incorreta. Não foi possível alterar a senha.");
        }
    }
}
