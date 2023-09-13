package Aula08;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Caduh";

        Disciplina matematica = new Disciplina();
        matematica.adicionaNota(9);
        matematica.adicionaNota(7);

        Disciplina portugues = new Disciplina();
        portugues.adicionaNota(8);
        portugues.adicionaNota(8);

        aluno.disciplinas.add(matematica);
        aluno.disciplinas.add(portugues);

        Frequencia aula1209 = new Frequencia();
        aula1209.dataAula = LocalDate.of(2023,9,12);
        aula1209.presenca = true;

        aluno.frequencias.add(aula1209);

        Frequencia aula1109 = new Frequencia();
        aula1109.dataAula= LocalDate.of(2023,9,11);
        aula1109.presenca = false;

        aluno.frequencias.add(aula1109);

        Filiacao filiacao = new Filiacao();
        filiacao.nomePai = "Otávio";
        filiacao.nomeMae = "Lucemar";

        aluno.filiacao = filiacao;


        Bolsa bolsa1 = new Bolsa();
        bolsa1.dataInicial = LocalDate.of(2022,8,15);
        bolsa1.dataFinal = LocalDate.of(2024,8,15);
        bolsa1.descrissao = "Estadual";

        aluno.bolsa = bolsa1;


        Integer notaGeral = aluno.calcularMediaGeral();
        System.out.println("O aluno "+aluno.nome+" tem média geral "+notaGeral);
        System.out.println(aluno.frequencias);
        System.out.println(aluno.filiacao);
        System.out.println("Aluno bolsista com os seguintes dados: "+aluno.bolsa);
    }
}