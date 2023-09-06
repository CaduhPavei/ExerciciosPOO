package Aula07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();
        List<Boolean> frequenciasAluno01 = new ArrayList<>();

        frequenciasAluno01.add(true);
        frequenciasAluno01.add(false);
        frequenciasAluno01.add(false);
        frequenciasAluno01.add(true);
        frequenciasAluno01.add(true);
        frequenciasAluno01.add(false);
        frequenciasAluno01.add(true);
        frequenciasAluno01.add(true);
        frequenciasAluno01.add(true);
        frequenciasAluno01.add(true);

        aluno01.codigo = 122334;
        aluno01.nome = "Dr. Webber";
        aluno01.dataNascimento = LocalDate.of(1999,12,16);
        aluno01.endereco = "Rua tal de tal";
        aluno01.telefone = "48 999089410";
        aluno01.matricula = "A3411O";
        aluno01.anoConclue = 2025;
        aluno01.anoInicio = 2023;
        aluno01.sexo = "Masculino";
        aluno01.nomeMae = "Laura";
        aluno01.turma = "ADS2";
        aluno01.frequencia = frequenciasAluno01;

        notasMatematica.add(10);
        notasMatematica.add(8);

        disciplinas.put("Matemática", notasMatematica);
        notasPortugues.add(8);
        notasPortugues.add(6);
        disciplinas.put("Portugues", notasPortugues);

        aluno01.disciplinasNotas = disciplinas;

        aluno01.imprimirDadosAluno();
        aluno01.calcularMediaPorMateria();
        aluno01.calcularMediaGeral();

        System.out.println("Aluno "+ aluno01.nome + " possui a média " + aluno01.calcularMediaGeral());

        Integer mediaGeralAluno = aluno01.calcularMediaGeral();

        Boletim boletim = new Boletim();
        String mensagemAprovacao = boletim.verificaAlunoAprovado(aluno01.nome,mediaGeralAluno, aluno01.frequenciaAluno());

        System.out.println(mensagemAprovacao);


    }
}
