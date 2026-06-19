import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;

    private static int nextId = 1;

    //get e set - salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        if (salario<1100) {
            System.out.println("O Salário não pode ser inferior a R$1100,00");
            return;
        } else {
            this.salario=salario;
        }
    }

    //get e set - nome
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome=nome;
    }

    //get e set dataAdmissao
    public void setData(LocalDate dataAdmissao) {
        LocalDate hoje = LocalDate.now();
        if (dataAdmissao.isAfter(hoje)) {
            System.out.println("Erro: A data de admissão não pode ser uma data futura!");
            return; 
        } else {
            this.dataAdmissao=dataAdmissao;
        }
    }
    public LocalDate getData() {
        return dataAdmissao;
    }

    //identificador
    public Funcionario() {
        this.identificador=nextId;
        nextId++;
    }
    public int getIdentificador() {
        return identificador;
    }
}