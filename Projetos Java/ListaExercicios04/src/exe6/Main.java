package exe6;
public class Main {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial("Pedro", 2000, 789456, 6000);

        // Testando operações
        contaEspecial.deposito(1000);
        contaEspecial.retira(2000);

        // Mostrando saldo e limite
        System.out.println("Saldo da conta especial: " + contaEspecial.getSaldo());
        System.out.println("Limite da conta especial: " + contaEspecial.getLimite());
    }
}