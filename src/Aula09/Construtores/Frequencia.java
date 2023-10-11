package Aula09.Construtores;

import java.time.LocalDate;

public class Frequencia {
    public LocalDate dataAula;
    public Boolean presenca;

    @Override
    public String toString() {
        return "Frequencia{" +
                "dataAula=" + dataAula +
                ", presenca=" + presenca +
                '}';
    }
}
