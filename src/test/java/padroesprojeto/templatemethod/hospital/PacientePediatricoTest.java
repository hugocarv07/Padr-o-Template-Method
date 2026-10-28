package padroesprojeto.templatemethod.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacientePediatricoTest {

    @Test
    void deveRetornarPrioritario() {
        PacientePediatrico paciente = new PacientePediatrico();
        paciente.setNivelDor1(5.0f);
        paciente.setNivelDor2(5.0f);
        assertEquals("Prioritário", paciente.verificarPrioridade());
    }

    @Test
    void deveRetornarNaoPrioritario() {
        PacientePediatrico paciente = new PacientePediatrico();
        paciente.setNivelDor1(5.0f);
        paciente.setNivelDor2(4.9f);
        assertEquals("Não prioritário", paciente.verificarPrioridade());
    }

    @Test
    void deveRetornarInformacoes() {
        PacientePediatrico paciente = new PacientePediatrico();
        paciente.setNivelDor1(5.0f);
        paciente.setNivelDor2(4.9f);
        paciente.setNome("Marcelo");
        paciente.setProntuario(2);
        assertEquals("PacientePediatrico{prontuario=2, nome='Marcelo', resultado=Não prioritário}", paciente.getInfo());
    }

    @Test
    void mesmaMediaDeveTerPrioridadeDiferenteEntreAdultoEPediatrico() {
        PacienteAdulto adulto = new PacienteAdulto();
        PacientePediatrico crianca = new PacientePediatrico();
        adulto.setNivelDor1(6.0f);
        adulto.setNivelDor2(6.0f);
        crianca.setNivelDor1(6.0f);
        crianca.setNivelDor2(6.0f);
        assertEquals("Não prioritário", adulto.verificarPrioridade());
        assertEquals("Prioritário", crianca.verificarPrioridade());
    }
}
