package Aula10.Sobrescrever;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Dani");
        secretaria.setCodigo(20);
        secretaria.setBonus(500.00);
        secretaria.setHorasExtras(150.00);
        secretaria.setSalarioFamilia(200.00);
        secretaria.setSalarioContratual(3000.00);

        Professor professor = new Professor();
        professor.setNome("Bruno");
        professor.setCodigo(10);
        professor.setValorHora(39.90);
        professor.setCargaHoraria(85.5);

        Diretor diretor = new Diretor();
        diretor.setNome("Ricardo");
        diretor.setSalarioContratual(15000.00);
        diretor.setBonusFaturamento(8000.00);
        diretor.setComissao(4000.00);
        diretor.setSalarioFamilia(1500.00);

        Gerente gerente = new Gerente();
        gerente.setNome("Juliana");
        gerente.setSalarioContratual(4000.00);
        gerente.setSalarioFamilia(400.00);
        gerente.setBonusVendasDepartamento(2000.00);
        gerente.setFatorMultiplicador(15.00);


        System.out.println(secretaria.getNome());
        System.out.println(secretaria.getSalario());
        System.out.println(professor.getNome());
        System.out.println(professor.getSalario());
        System.out.println(diretor.getNome());
        System.out.println(diretor.getSalario());
        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());

    }
}












