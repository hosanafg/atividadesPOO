public class Teste extends Produto {
    public Teste(String nome, String descricao, double preco) {
        super(nome, descricao, preco); 
    }
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", "16GB RAM, 512GB SSD", 4500.00);
        System.out.println(p1); 
    }
}