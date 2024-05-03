package exe4;
public class Pedra extends Coisa {
    @Override
    boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Tesoura;
    }

    @Override
    boolean perdeDe(Coisa coisa) {
        return coisa instanceof Papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}