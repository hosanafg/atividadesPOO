public class Circulo extends ObjetoGeometrico {
    private double r;

    public Circulo (double r) {
        super("Circulo");
        if (r<=0) {
            System.out.println("O raio não pode ser zero nem negativo!");
        } else {
            this.r=r;
        }
    }

    @Override
    public double calcularArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*2*r;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Raio: "+r);
    }
}
