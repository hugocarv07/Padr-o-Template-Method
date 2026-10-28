package padroesprojeto.templatemethod.hospital;

public class PacienteAdulto extends Paciente {

    protected float getLimitePrioridade() {
        return 7.0f;
    }

    protected String getTipoPaciente() {
        return "PacienteAdulto";
    }
}
