package exe4;
public class Tesoura extends Coisa {
    @Override
    boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Papel;
    }

    @Override
    boolean perdeDe(Coisa coisa) {
        return coisa instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
