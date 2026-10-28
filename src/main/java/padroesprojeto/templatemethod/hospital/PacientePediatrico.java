package padroesprojeto.templatemethod.hospital;

public class PacientePediatrico extends Paciente {

    protected float getLimitePrioridade() {
        return 5.0f;
    }

    protected String getTipoPaciente() {
        return "PacientePediatrico";
    }
}
