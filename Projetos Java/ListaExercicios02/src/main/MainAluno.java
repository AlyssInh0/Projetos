package main;
import aluno.Aluno;
public class MainAluno {
        public static void main(String[] args) {
            Aluno obj = new Aluno();
            obj.setIdade(-10); // Estamos protegidos.
            obj.setP1(11);
            obj.setIdade(19);
            obj.setP1(8.0f);
            obj.setP2(9.0f);
            obj.setNroAluno(123);
            obj.setNome("Fulano");

            System.out.println(obj.toString());
            System.out.println("\nNome: " + obj.getNome());
    }
}