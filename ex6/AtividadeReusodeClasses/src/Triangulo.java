public class Triangulo extends ObjetoGeometrico{
    private double ladoA, ladoB ,ladoC;
    private double perimetro;

    public Triangulo(double ladoA,double ladoB, double ladoC){
        super("Triangulo");
        if (ladoA<=0 || ladoB<=0 || ladoC<=0) {
            System.out.println("Nenhum dos lados podem ser menores ou iguais a zero");
        } else {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        }
    }

    @Override
    public double calcularPerimetro(){
        perimetro=ladoA+ladoB+ladoC;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        return(perimetro*(perimetro-ladoA)*(perimetro-ladoB)*(perimetro-ladoC));
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
    }
}
