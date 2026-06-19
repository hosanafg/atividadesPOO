public class Principal {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];

        formas[0] = new Retangulo("Vermelho", 5.0, 4.0);

        for (Forma f : formas) {
            if (f != null) { 
                System.out.println("--- Processando Forma ---");
                f.desenhar();
                System.out.printf("Cor: %s | Área: %.2f\n\n", f.getCor(), f.calcularArea());
    }
}
    }
}