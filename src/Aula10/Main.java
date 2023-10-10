package Aula10;

import java.time.LocalDate;
import java.util.List;


    public class Main {
        public static void main(String[] args) {

            Aluno alunoInteligente = new Aluno(1010,"Bruno Kurzawe");
            Aluno alunoTrapaceiro = new Aluno(1020,"Maria Luiza Kurzawe");
            alunoInteligente.setDataNascimento(LocalDate.of(1993,9,30));

            Disciplina portuguesInteligente = new Disciplina("Portugues", List.of(8,9));
            Disciplina portuguesTrapaseiro = new Disciplina("Portugues", List.of(5,4));
            Disciplina matematicaInteligente = new Disciplina("Matematica", List.of(8,9));
            Disciplina matematicaTrapaseiro = new Disciplina("Matematica", List.of(5,4));

            alunoInteligente.addDisciplina(portuguesInteligente);
            alunoInteligente.addDisciplina(matematicaInteligente);
            alunoTrapaceiro.addDisciplina(portuguesTrapaseiro);
            alunoTrapaceiro.addDisciplina(matematicaTrapaseiro);

            alunoInteligente.calcularMediaGeral();
            System.out.println("Nota do aluno: "+alunoInteligente.getNome()+" é " +alunoInteligente.getMediaGeral());

            alunoTrapaceiro.calcularMediaGeral();
            System.out.println("Nota do aluno: "+alunoTrapaceiro.getNome()+" é " +alunoTrapaceiro.getMediaGeral());
            System.out.println(alunoInteligente);

        }
    }