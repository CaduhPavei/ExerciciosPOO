package Aula10.Heranca;

import java.time.LocalDate;

public class Professor extends Contratado {
    private LocalDate dataContratacao;

    public Professor(){

    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + super.getNome() + '\'' +
                ", matricula='" + super.getMatricula() + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}






