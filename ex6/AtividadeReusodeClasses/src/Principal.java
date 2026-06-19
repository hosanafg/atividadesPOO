public class Principal {
    public static void main(String[] args) {

        ObjetoGeometrico circulo=new Circulo(6);
        circulo.mostrarDados();
        System.out.println();

        ObjetoGeometrico triangulo=new Triangulo(2,4,5);
        triangulo.mostrarDados();
        System.out.println();

        ObjetoGeometrico quadrado = new Quadrilatero(5);
        quadrado.mostrarDados();
        System.out.println();

    }
}
