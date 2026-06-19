public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor); // Invoca o construtor da classe abstrata
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo " + getCor() + " na tela. █");
    }
} 