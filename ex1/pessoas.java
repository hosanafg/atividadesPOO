import java.time.LocalDate;

class Pessoa {
    private String nome;
    private char sexo;
    private LocalDate dataNascimento;

    public Pessoa(String nome, char sexo, LocalDate dataNascimento) {
        this.nome=nome;
        this.sexo=sexo;
        this.dataNascimento=dataNascimento;
    }

    public String getNome() {return nome;}
    public char getSexo() {return sexo;}
    public LocalDate getDataNascimento() {return dataNascimento;}
}