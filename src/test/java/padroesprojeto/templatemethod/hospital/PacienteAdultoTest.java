package padroesprojeto.templatemethod.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteAdultoTest {

    @Test
    void deveRetornarPrioritario() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setNivelDor1(7.0f);
        paciente.setNivelDor2(7.0f);
        assertEquals("Prioritário", paciente.verificarPrioridade());
    }

    @Test
    void deveRetornarNaoPrioritario() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setNivelDor1(7.0f);
        paciente.setNivelDor2(6.9f);
        assertEquals("Não prioritário", paciente.verificarPrioridade());
    }

    @Test
    void deveRetornarInformacoes() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setNivelDor1(7.0f);
        paciente.setNivelDor2(7.0f);
        paciente.setNome("Marco");
        paciente.setProntuario(1);
        assertEquals("PacienteAdulto{prontuario=1, nome='Marco', resultado=Prioritário}", paciente.getInfo());
    }
}
