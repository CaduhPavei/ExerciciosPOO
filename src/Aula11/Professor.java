package Aula11;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private Double cargaHoraria;
    private Double valorHora;

    @Override
    public Double getSalario() {
        return cargaHoraria * valorHora;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public void setDadosProfessor(Double cargaHoraria, Double valorHora){
        this.setDadosProfessor(cargaHoraria, null);
    }


    public Professor(Integer codigo, String nome, LocalDate dataNascimento, String matricula, Double salario, Double cargaHoraria, Double valorHora) {
        this.setCodigo (codigo);
        this.setNome (nome);
        this.setDataNascimento (dataNascimento);
        this.setMatricula (matricula);
        this.setSalario (salario);
        this.setCargaHoraria (cargaHoraria);
        this.setValorHora (valorHora);
    }

}






