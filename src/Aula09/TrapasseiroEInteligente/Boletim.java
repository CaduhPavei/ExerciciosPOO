package Aula09.TrapasseiroEInteligente;

public class Boletim {

    Aluno aluno;

    public void verificaAlunoAprovado(Integer mediaGeral) {
        if (mediaGeral >= 7) {
            System.out.println("O aluno " + aluno.getNome() + " foi APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("O aluno " + aluno.getNome() + " foi para RECUPERACAO");
        } else {
            System.out.println("O aluno " + aluno.getNome() + " foi REPROVADO");
        }
    }

    public Aluno getAluno() {
        return aluno;
    }

}





