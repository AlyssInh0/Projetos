package exe4;
import java.util.Random;
public class Jogo {
    public static void main(String[] args) {
        Coisa[] opcoes = {new Pedra(), new Papel(), new Tesoura()};
        Random random = new Random();

        Coisa jogador = opcoes[random.nextInt(opcoes.length)];
        Coisa computador = opcoes[random.nextInt(opcoes.length)];

        System.out.println("Jogador escolheu: " + jogador);
        System.out.println("Computador escolheu: " + computador);

        if (jogador.ganhaDe(computador)) {
            System.out.println("Jogador venceu!");
        } else if (jogador.perdeDe(computador)) {
            System.out.println("Computador venceu!");
        } else {
            System.out.println("Empate!");
        }
    }
}