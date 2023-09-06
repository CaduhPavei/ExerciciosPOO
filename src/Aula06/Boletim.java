package Aula06;

public class Boletim {

    String aluno;
    public String verificaAlunoAprovado(String aluno, Integer mediaGeral) {

        if (mediaGeral>=7){
            return "O aluno " +aluno+ " está APROVADO";
        }else if (mediaGeral>=5){
            return "O aluno " +aluno+ " está em RECUPERAÇÃO";
        }else {
            return "O aluno " +aluno+ " está REPROVADO";
        }
    }
}
