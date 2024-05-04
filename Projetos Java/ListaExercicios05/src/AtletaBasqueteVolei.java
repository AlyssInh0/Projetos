public class AtletaBasqueteVolei implements JogadorBasquete, JogadorVolei {
    @Override
    public void fazerBandeja() {
        System.out.println("Atleta que joga basquete - fez bandeja.");
    }
    @Override
    public void pegarRebote() {
        System.out.println("Atleta que joga basquete - pegou rebote.");
    }
    @Override
    public void sacar() {
        System.out.println("Atleta que joga volei - sacou.");
    }
    @Override
    public void cortar() {
        System.out.println("Atleta que joga volei - cortou.");
    }
}
