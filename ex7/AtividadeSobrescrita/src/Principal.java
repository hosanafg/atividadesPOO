public class Principal {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("HGF");

        Medico medico1=new Medico("123456789", "Psiquiatra", 8000, 
                            "Claudia", "Av. Teste 1002", 28, 
                            "00000000000", "Feminino");
        
        System.out.println();

        Paciente paciente1 = new Paciente("Gertrudes", "Avenida Teste 123", 58, 
                                         "12345678900", "Feminino", "TAG", 
                                        "Escitalopram 15mg");

        System.out.println();

        //cadastrar medico e paciente
        hospital.cadastrarMedico(medico1);
        hospital.cadastrarPaciente(paciente1);

        //comportamentos
        medico1.darPlantao();
        paciente1.sentirDor();
        System.out.println();

        hospital.imprimirValores();

    }
}
