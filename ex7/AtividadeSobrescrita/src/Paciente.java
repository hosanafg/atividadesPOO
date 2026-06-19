public class Paciente extends Pessoa {
    private String doenca;
    private String medicacao;

    public Paciente(String nome, String endereco, int idade, String cpf, String sexo, String doenca, String medicacao) {
        super(nome, endereco, idade, cpf, sexo);
        this.doenca=doenca;
        this.medicacao=medicacao;
    }

    //getters e setters de doença e medicação
    public String getDoenca () {
        return doenca;
    } public void setDoenca(String doenca) {
        this.doenca=doenca;
    }

    public String getMedicacao() {
        return medicacao;
    } public void setMedicacao(String medicacao) {
        this.medicacao=medicacao;
    }

    //comportamento
    public void sentirDor() {
        System.out.println(getNome() + " está sentindo dor.\nDoença: " + this.doenca);
    } public void terAlta() {
        System.out.println(getNome() + " recebeu alta!\nMedicação prescrita: " + this.medicacao);
    }

    @Override
    public void imprimirValores() {
        super.imprimirValores();
        System.out.println("Doença: "+this.doenca);
        System.out.println("Medicação: "+this.medicacao);
    }
}
