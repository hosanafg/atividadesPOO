public class ObjetoGeometrico {
    private String nome;

    public ObjetoGeometrico(String nome) {
        this.nome=nome;
    }

    public double calcularArea (){
        return 0.0;
    } 
    
    public double calcularPerimetro () {
        return 0.0;
    }

    public void mostrarDados () {
        System.out.println("Tipo: "+this.nome);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}
