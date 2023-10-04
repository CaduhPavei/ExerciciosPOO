package Aula09.TrapasseiroEInteligente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Integer mediaGeral = 0;

    public Aluno(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Integer calcularMediaGeral() {
        Integer somaMedias = 0;
        for (Disciplina disciplina : disciplinas) {
            somaMedias += disciplina.calcularMediaDisciplina();
        }
        mediaGeral = somaMedias / disciplinas.size();
        return mediaGeral;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Integer getMediaGeral() {
        return mediaGeral;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", disciplinas=" + disciplinas +
                ", mediaGeral=" + mediaGeral +
                '}';
    }
}
