public class Principal {

    public static void alterarNome (Hospital hospital) {
        hospital=new Hospital("Hospital com nome AINDA MAIS antigo"); //não altera em nada
        hospital.setNome("Hospital Com Novo Nome!");
    }
    public static void main (String [] args) {
        Hospital h=new Hospital("Hospital Com Nome Antigo!");
        System.out.println("ANTES DO MÉTODO:  [NOME] "+h.getNome());

        alterarNome(h);
        System.out.println("DEPOIS DO MÉTODO: [NOME] "+h.getNome());
    }
}