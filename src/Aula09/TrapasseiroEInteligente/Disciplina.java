package Aula09.TrapasseiroEInteligente;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
        private String nome;
        private String professor;

    public Disciplina(String nome, List<Integer> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    List<Integer> notas = new ArrayList<>();

        public void adicionaNota(Integer nota) {
            notas.add(nota);
        }

        public Integer calcularMediaDisciplina() {
            Integer somaNotas = 0;
            for (Integer nota:notas){
                somaNotas += nota;
            }
                return somaNotas / notas.size();
        }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", notas=" + notas +
                '}';
    }
}
