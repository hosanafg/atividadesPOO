/*Crie a classe Produto com os atributos privados: nome, descrição e preço. 
Esta classe deve possuir os métodos get e set para cada atributo, bem como um construtor que 
receba todos os argumentos. Crie também os métodos equals e toString. 
O método toString deve imprimir uma frase parecida com a seguir: 
“Produto: <nome>, <descrição>, <preço>”. Não deve existir construtor padrão.
 */

public class Produto {
    private String nome, descricao;
    private double preco;

    //setters
    public void setNome(String nome) {
        this.nome=nome;
    } public void setDescricao (String descricao) {
        this.descricao=descricao;
    } public void setPreco(double preco) {
        this.preco=preco;
    }

    //getters
    public String getNome() {return nome;}
    public String getDescricao() {return descricao;}
    public double getPreco() {return preco;}

    //construturo
    public Produto (String nome, String descricao, double preco) {
        this.preco=preco;
        this.nome=nome;
        this.descricao=descricao;
    }

    //metodo toString
    @Override
    public String toString () {
        return "Nome: "+this.nome+"\nDescrição: "+this.descricao+"\nPreço: "+this.preco;
    }

    //metodo equals
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        if (this.nome != null ? !this.nome.equals(produto.nome) : produto.nome != null) return false;
        return this.descricao != null ? this.descricao.equals(produto.descricao) : produto.descricao == null;
    }
}
