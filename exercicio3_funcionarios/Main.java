package exercicio3_funcionarios;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Souza", 8500.0, "Tecnologia");
        Desenvolvedor dev = new Desenvolvedor("Java", "Carlos Lima", 6000.0);

        System.out.println("--- Dados do Gerente ---");
        gerente.mostrarDados();
        gerente.realizarReuniao();

        System.out.println("\n--- Dados do Desenvolvedor ---");
        dev.mostrarDados();
        dev.programar();
    }
}