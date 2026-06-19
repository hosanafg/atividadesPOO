import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;

    private final List<Medico> corpoMedico;
    private final List<Paciente> pacientesCadastrados;

    //GETTErs e setters
    public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome=nome;
    }


    public Hospital(String nome) {
        this.nome=nome;
        this.corpoMedico=new ArrayList<>();
        this.pacientesCadastrados=new ArrayList<>();
    }

    //metodos
    public void cadastrarMedico(Medico medico) {
        this.corpoMedico.add(medico);
    }

    public void cadastrarPaciente(Paciente paciente) {
        this.pacientesCadastrados.add(paciente);
    }

    // imprimir dados hospital
    public void imprimirValores() {
        System.out.println("========== HOSPITAL: " + this.nome.toUpperCase() + " ==========");
        System.out.println("\n--- LISTA MÉDICOS ---");
        
        for (Medico m:corpoMedico) {
            m.imprimirValores();
            System.out.println("=======================");
        }
        
        System.out.println("\n--- PACIENTES INTERNADOS/CADASTRADOS ---");
        for (Paciente p:pacientesCadastrados) {
            p.imprimirValores();
            System.out.println("=======================");
        }
    }
}
