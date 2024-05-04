public class Main {
    public static void main(String[] args) {
        AtletaBasqueteVolei abv = new AtletaBasqueteVolei();
        abv.cortar(); abv.fazerBandeja(); abv.pegarRebote(); abv.sacar();

        JogadorBasquete jb = new AtletaBasqueteVolei();
        jb.fazerBandeja(); jb.pegarRebote();
    }
}