public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.alterarPreco(preco);
        this.adicionarEstoque(quantidadeInicial);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        }
        else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
        else {
            System.out.println("Erro: A quantidade adicionada deve ser positiva.");
        }
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        }
        else {
            System.out.println("Erro: Operação inválida. Estoque insuficiente ou quantidade negativa.");
        }
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void mostrarDados() {
        System.out.println("Produtos: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor Total em estoque: R$ " + calcularValorEstoque());
    }
}