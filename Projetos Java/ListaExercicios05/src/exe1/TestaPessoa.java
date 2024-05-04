package exe1;
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa("123", "456");
        objPessoa.ensina();
        objPessoa.trabalha();
        objPessoa.tiraCPF();
        objPessoa.pagaIR();
        objPessoa.tiraRG();
        objPessoa.vota();
        objPessoa.come();
        objPessoa.respira();

        Contribuinte objContribuinte = new Pessoa("234", "567");
        objContribuinte.pagaIR();
        objContribuinte.tiraCPF();

        Professor objProfessor = new Pessoa("345", "678");
        objProfessor.ensina();
        objProfessor.trabalha();
    }
}

