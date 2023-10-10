package Aula10;

import java.time.LocalDate;

public class Professor {

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String matricula;
    private LocalDate dataContratacao;

    public Professor() {
    }

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}






