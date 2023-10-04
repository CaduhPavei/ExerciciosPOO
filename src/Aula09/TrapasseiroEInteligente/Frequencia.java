package Aula09.TrapasseiroEInteligente;

import java.time.LocalDate;

public class Frequencia {
    LocalDate dataAula;
    Boolean presenca;

    @Override
    public String toString() {
        return "Frequencia{" +
                "dataAula=" + dataAula +
                ", presenca=" + presenca +
                '}';
    }
}
