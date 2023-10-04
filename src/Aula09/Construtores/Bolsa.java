package Aula09.Construtores;

import java.time.LocalDate;

public class Bolsa {
    LocalDate dataInicial;
    LocalDate dataFinal;
    String descrissao;

    @Override
    public String toString() {
        return "Bolsa{" +
                "dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", descrissao='" + descrissao + '\'' +
                '}';
    }
}
