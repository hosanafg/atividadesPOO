class Atendimento {
    private LocalDate data;
    private String tipo;
    private String descricao;
    private Pessoa paciente;
    private ProfissionalSaude medico; 

    public Atendimento(LocalDate data, String tipo, 
                        String descricao, Pessoa paciente, 
                        ProfissionalSaude medico) {
        this.data=data;
        this.tipo=tipo;
        this.descricao=descricao;
        this.paciente=paciente;
        this.medico=medico;
    }

    public String getDetalhesAtendimento() {
        return String.format("Data: %s | Paciente: %s | 
                            Procedimento: %s | Médico: %s", 
                data, paciente.getNome(), tipo, medico.getNome());
    }
}