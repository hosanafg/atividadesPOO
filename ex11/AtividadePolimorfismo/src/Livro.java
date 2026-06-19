/*Crie a classe Livro, que herda de Produto, adicionando os atributos privados: autores, 
ISBN e editora. Esta classe deve possuir os métodos get e set para cada atributo da classe Livro, 
bem como um construtor que receba todos os argumentos (incluindo os da classe Produto, 
que devem ser repassados para a classe pai no construtor). 
Os métodos equals e toString devem ser sobrescritos. O método toString deve imprimir uma frase 
parecida com a seguir: “Livro: <nome>, <descrição>, <preço>, <autores>, <ISBN>, <editora>”.
 */

public class Livro extends Produto {
    private String autor, editora, ISBN;

    //setters
    public void setAutor(String autor) {
        this.autor=autor;
    } public void setEditora(String editora) {
        this.editora=editora;
    } public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    //getters
    public String getAutor() {return autor;}
    public String getEditora() {return editora;}
    public String getISBN() {return ISBN;}

    public Livro(String nome, String descricao, double preco,String autor, 
                String editora, String ISBN) {
        super(nome, descricao, preco); 
        this.autor=autor;
        this.editora=editora;
        this.ISBN=ISBN;
    }

    @Override
    public String toString() {
        return super.toString()+"Autor:" +this.autor+" ISBN: "+this.ISBN+" Editora: "+this.editora;
    }
    
}
