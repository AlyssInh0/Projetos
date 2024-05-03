package exe2;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro(1,"Fulano","000.111.222-33");
        Reserva reserva1 = new Reserva(111, "20/03/2024", passageiro1);

        Voo voo = new Voo(1234, "São Paulo", "Maceió", reserva1);
        System.out.println(voo.toString());
    }
}