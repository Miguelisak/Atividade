package exercicio3_funcionarios;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void realizarReuniao() {
        System.out.println("O gerente " + getNome() + " está a realizar uma reunião para o setor de " + setor + ".");
    }
}