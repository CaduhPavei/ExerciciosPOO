package Aula07;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {
    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinasNotas;
    String matricula;
    String sexo;
    String nomeMae;
    String turma;
    Integer anoConclue;
    Integer anoInicio;
    List<Boolean> frequencia;

    public void imprimirDadosAluno(){
        System.out.println("Código: " + codigo + " Nome: " + nome + " Data de nascimento: " + dataNascimento);
    }
    public void calcularMediaPorMateria() {
        for (Map.Entry<String, List<Integer>> entry: disciplinasNotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina: " + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }

            System.out.println("Média: " + (somaNotas / notas.size()));
        }
    }
    public Integer calcularMediaGeral() {
        Integer mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            List<Integer> notas = entry.getValue();

            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            mediaGeral += somaNotas / notas.size();
        }
        return (mediaGeral / disciplinasNotas.size());
    }
    public Double frequenciaAluno(){
        double faltas=0, presencas=0, total;
        for (int i=0; i< frequencia.size();i++){
            if (frequencia.get(i)==false){
                faltas++;
            }else {
                presencas++;
            }
        }
        total=((frequencia.size()-faltas)/frequencia.size())*100;
        return total;
    }
}
