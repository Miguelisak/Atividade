package exercicio2_Aluno;

public class Aluno {
    private String nome;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setPrimeiraNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.primeiraNota = nota;
        }
        else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }

    public void setSegundaNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.segundaNota = nota;
        }
        else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2.0;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + primeiraNota);
        System.out.println("Nota 2: " + segundaNota);
        System.out.println("Média: " + calcularMedia());
    }
}