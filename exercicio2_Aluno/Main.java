package exercicio2_Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Miguel Isak");

        System.out.println("--- Testando Atribuições Inválidas ---");
        aluno.setPrimeiraNota(-2.0);
        aluno.setSegundaNota(11.5);

        System.out.println("\n-- Testando Atribuições Válidas ---");
        aluno.setPrimeiraNota(8.5);
        aluno.setSegundaNota(9.0);
        aluno.mostrarDados();
    }
}