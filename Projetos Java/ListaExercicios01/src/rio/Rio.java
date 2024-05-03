package rio;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    public Rio() {

    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x) {
        this.nivel -= x;
    }

    public void nivelAgua() {
        this.chover(15);
        this.ensolarar(10);

        System.out.println("Nível da água após chuva, e em seguida, uma ensolação: " + this.nivel);
    }

    public void poluicao() {
        this.sujar();
        System.out.println("Após a chuva, o rio está sujo/poluído.");
    }

    public String mostra() {
        return "\nNome do Rio: " + this.nome + "\nNível de água: " + this.nivel + "\nPoluído: " + this.poluido;
    }
}