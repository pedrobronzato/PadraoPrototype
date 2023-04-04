package org.prototype;

public class Medico implements Cloneable {
    private String nome;
    private Paciente paciente;
    private String especializacao;

    public Medico(String nome, Paciente paciente, String especializacao) {
        this.nome = nome;
        this.paciente = paciente;
        this.especializacao = especializacao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public Medico clone() throws CloneNotSupportedException {
        Medico medicoClone = (Medico) super.clone();
        medicoClone.paciente = (Paciente) medicoClone.paciente.clone();
        return medicoClone;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", paciente=" + paciente +
                ", especializacao='" + especializacao + '\'' +
                '}';
    }
}
