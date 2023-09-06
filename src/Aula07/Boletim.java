package Aula07;

public class Boletim {

    String aluno;
    public String verificaAlunoAprovado(String aluno, Integer mediaGeral, Double frequencia) {
        if (frequencia<70){
            return "o aluno "+aluno+" está REPROVADO";
        }else {
            if (mediaGeral >= 7) {
                return "O aluno " + aluno + " está APROVADO";
            } else if (mediaGeral >= 5) {
                return "O aluno " + aluno + " está em RECUPERAÇÃO";
            } else {
                return "O aluno " + aluno + " está REPROVADO";
            }
        }
    }
}
