package org.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Medico medico = new Medico("Carlos", new Paciente("Jose", 20), "Cirurgia");

        Medico medicoClone = medico.clone();
        medicoClone.setNome("Medico clonado");
        medicoClone.getPaciente().setIdade(21);

        assertEquals("Medico{nome='Carlos', paciente=Paciente{nome='Jose', idade=20}, especializacao='Cirurgia'}", medico.toString());
        assertEquals("Medico{nome='Medico clonado', paciente=Paciente{nome='Jose', idade=21}, especializacao='Cirurgia'}", medicoClone.toString());
    }

}