public class Pessoa {
    public static void validarCPF(String cpf) throws CPFInvalido {
        if (cpf==null || cpf.isEmpty()) {
            throw new CPFInvalido("O CPF não pode estar em branco");
        } else {
            System.out.println("CPF Cadastrado com sucesso");
        }
    }

    public static void main(String[] args) {
        String cpfPessoa1 = "";

        try {
            validarCPF(cpfPessoa1);
            System.out.println("CPF Digitado: "+cpfPessoa1);
            System.out.println("CPF salvo com sucesso!");
        } catch (CPFInvalido e) {
            System.out.println("CPF INVÁLIDO ");
            System.out.println("Motivo da falha: " + e.getMessage());
        }
    }
}
