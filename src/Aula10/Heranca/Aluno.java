package Aula10.Heranca;

public class Aluno extends Pessoa {



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + super.getNome() + '\'' +
                '}';
    }
}
