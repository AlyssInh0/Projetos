package exe4;
public class Papel extends Coisa {
    @Override
    boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Pedra;
    }

    @Override
    boolean perdeDe(Coisa coisa) {
        return coisa instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}