package exe2;

public class Reserva {
    private int id;
    private String data;
    private Passageiro passageiro;
    public Reserva() {
    }

    public Reserva(int id, String data, exe2.Passageiro passageiro) {
        this.setId(id);
        this.setData(data);
        this.setPassageiro(passageiro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public exe2.Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(exe2.Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "\nID: " + id +
                "\nData: " + data +
                "\n\nDados do passageiro: " + passageiro;
    }
}
