public class Pessoa {
    private String nome, endereco, sexo,cpf;
    private int idade;

    public Pessoa(String nome, String endereco, int idade, String cpf, String sexo) {
        this.nome=nome;
        this.endereco=endereco;
        this.idade=idade;
        this.cpf=cpf;
        this.sexo=sexo;
    }

    //setters
    public void setNome(String nome) {
        this.nome=nome;
    } public void setEndereco(String endereco) {
        this.endereco=endereco;
    } public void setSexo(String sexo) {
        this.sexo=sexo;
    } public void setCPF(String cpf) {
        this.cpf=cpf;
    } public void setIdade (int idade) {
        this.idade=idade;
    }

    //getters
    public String getNome() {
        return nome;
    } public String getCPF() {
        return cpf;
    } public String getEndereco() {
        return endereco;
    } public String getSexo() {
        return sexo;
    } public int getIdade() {
        return idade;
    }

    //metodos
    public void imprimirValores() {
        System.err.println("======= DADOS DA PESSOA =======");
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Idade: "+this.idade);
    }

    public void andar() {
        System.out.println(this.nome + " está andando pelo hospital.");
    }

} 
