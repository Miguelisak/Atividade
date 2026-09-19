public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecanico", 250.0, 10);

        System.out.println("--- Dados Iniciais ---");
        produto.mostrarDados();

        System.out.println("\n--- Testando Operações Válidas ---");
        produto.alterarPreco(230.0);
        produto.adicionarEstoque(5);
        produto.retirarEstoque(3);
        produto.mostrarDados();

        System.out.println("\n--- Testando Operações Inválidas ---");
        produto.alterarPreco(-50.0);
        produto.adicionarEstoque(-2);
        produto.retirarEstoque(100);
    }
}