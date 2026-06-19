public class Medico extends Pessoa {
    private String crm, especializacao;
    private double salario;

    //getters e setters
    public String getEspecializacao() {
        return especializacao;
    } public void setEspecializacao(String especializacao) {
        this.especializacao=especializacao;
    }

    public double getSalario() {
        return salario;
    } public void setSalario (double salario) {
        this.salario=salario;
    }

    public String getCrm() {
        return crm;
    } public void setCrm(String crm) {
        this.crm=crm;
    }

    public Medico (String crm, String especializacao, double salario,String nome, String endereco, 
                    int idade, String cpf, String sexo){
            super(nome, endereco, idade, cpf, sexo);
            this.crm=crm;
            this.especializacao=especializacao;
            this.salario=salario;
        }
    
        //comportamento
        public void darPlantao() {
        System.out.println("O(a) Dr(a)" + getNome() + " está de plantão.\nEspecialidade: " + this.especializacao);
    }
}
