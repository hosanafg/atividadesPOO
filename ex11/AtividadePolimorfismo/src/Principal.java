import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Lista única para guardar Produtos e Livros (Polimorfismo na prática)
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("========= MENU =========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Cadastrar livro");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Imprimir tudo");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println(); 

            switch (opcao) {
                case 1:
                    System.out.println("--- Cadastrar Produto ---");
                    System.out.print("Nome: ");
                    String nomeProd = scanner.nextLine();

                    System.out.print("Descrição: ");
                    String descProd = scanner.nextLine();

                    System.out.print("Preço: ");
                    double precoProd = scanner.nextDouble();
                    scanner.nextLine();

                    Produto novoProduto = new Produto(nomeProd, descProd, precoProd);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("--- Lista de Produtos (Apenas) ---");
                    boolean encontrouProduto = false;
                    for (Produto p : listaProdutos) {
                        if (p.getClass() == Produto.class) {
                            System.out.println(p); 
                            encontrouProduto = true;
                        }
                    } if (!encontrouProduto) {
                        System.out.println("Nenhum produto comum cadastrado.");
                    } System.out.println();
                    break;

                case 3:
                    System.out.println("--- Cadastrar Livro ---");
                    System.out.print("Nome: ");
                    String nomeLivro = scanner.nextLine();

                    System.out.print("Descrição: ");
                    String descLivro = scanner.nextLine();

                    System.out.print("Preço: ");
                    double precoLivro = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Autor(es): ");
                    String autores = scanner.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();

                    Livro novoLivro = new Livro(nomeLivro, descLivro, precoLivro, autores, isbn, editora);
                    listaProdutos.add(novoLivro);
                    System.out.println("Livro cadastrado com sucesso!\n");
                    break;

                case 4:
                    System.out.println("--- Lista de Livros (Apenas) ---");
                    boolean encontrouLivro = false;
                    for (Produto p : listaProdutos) {
                        if (p instanceof Livro) {
                            System.out.println(p); 
                            encontrouLivro = true;
                        }
                    }
                    if (!encontrouLivro) {
                        System.out.println("Nenhum livro cadastrado.");
                    } System.out.println();
                    break;

                case 5:
                    System.out.println("--- Imprimir Tudo ---");
                    if (listaProdutos.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (Produto p : listaProdutos) {
                            System.out.println(p); 
                        }
                    } System.out.println();
                    break;

                case 6:
                    System.out.println("Encerrando o programa");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
                    break;
            }
        } scanner.close();
    }
}
