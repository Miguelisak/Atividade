package exercicio3_funcionarios;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor (String linguagem, String nome, double salario) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void programar() {
        System.out.println("O desenvolvedor " + getNome() + " está a programar em " + linguagem + ".");
    }
}