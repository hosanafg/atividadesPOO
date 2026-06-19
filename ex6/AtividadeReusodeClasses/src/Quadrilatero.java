public class Quadrilatero extends ObjetoGeometrico {
    private double ladoX, ladoY;

    public Quadrilatero(double lado) {
        super("Quadrado");
        if (lado <= 0) {
            System.out.println("[ERRO] O lado não pode ser zero nem negativo");
        } else {
            this.ladoX = lado;
            this.ladoY = lado;
        }
    }

    public Quadrilatero(double ladoX, double ladoY) {
        super(ladoX == ladoY ? "Quadrado" : "Retangulo");

        if (ladoX <= 0 || ladoY <= 0) {
            System.out.println("[ERRO] Os lados não podem ser zero nem negativos");
        } else {
            this.ladoX = ladoX;
            this.ladoY = ladoY;
        }
    }

    @Override
    public double calcularPerimetro() {
        return (2*ladoX)+(2*ladoY);
    }

    @Override
    public double calcularArea() {
        return ladoX*ladoY;
    }

    @Override
    public void mostrarDados () {
        super.mostrarDados();
    }

}
