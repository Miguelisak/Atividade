package exercicio4_formas;
public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Retangulo(10.0, 5.0);
        Forma forma2 = new Circulo(3.0);

        System.out.println("Área do Retangulo: " + forma1.calcularArea());
        System.out.println("Área do Circulo: " + forma2.calcularArea());
    }
}
