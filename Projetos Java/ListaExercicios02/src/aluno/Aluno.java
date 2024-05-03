package aluno;
public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;
    // Construtores
    public Aluno() { //Define um objeto sem valor inicial

    }
    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
        else
            System.out.println("Idade inválida");
    }
    public void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10)
            this.p1 = p1;
        else
            System.out.println("P1 inválida");
    }
    public void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10)
            this.p2 = p2;
        else
            System.out.println("P2 inválida");
    }
    public void setNroAluno(int nroAluno) {
        if (nroAluno > 0)
            this.nroAluno = nroAluno;
        else
            System.out.println("Número inválido");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNroAluno() {
        return this.nroAluno;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
    public float getP1() {
        return this.p1;
    }
    public float getP2() {
        return this.p2;
    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.nroAluno = nroAluno; this.nome = nome; this.idade = idade; this.p1 = p1; this.p2 = p2;
    }
    @Override
    public String toString() {
        return "\nAluno { " +
                "\nNúmero do aluno = " + nroAluno +
                ", \nIdade = " + idade +
                ", \nNome = " + nome +
                ", \nP1 = " + p1 +
                ", \nP2 = " + p2 +
                " \n}";
    }
}