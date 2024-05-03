package exe2;
public class Voo {
    private int id;
    private String origem, destino;
    private Reserva reserva;

    public Voo() {
    }

    public Voo(int id, String origem, String destino, Reserva reserva) {
        this.setId(id);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setReserva(reserva);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "\nInformações sobre o voo:" +
                "\nID: " + id +
                "\nOrigem: " + origem +
                "\nDestino: " + destino +
                "\n\nInformações da reserva: " + reserva;
    }
}
