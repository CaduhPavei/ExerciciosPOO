package Aula10.Heranca;

public class Main {
        public static void main(String[] args) {

            Aluno ricardo = new Aluno();
            ricardo.setCodigo(10);
            ricardo.setNome("Ricardo Pavei");

            Professor bruno = new Professor();
            bruno.setCodigo(20);
            bruno.setNome("Bruno");

            Funcionario funcionario = new Funcionario();
            funcionario.setCodigo(122);
            funcionario.setNome("João");
            funcionario.setCargo("Consultor");
            funcionario.setSalario(1700.00);


            System.out.println(funcionario);
            System.out.println(bruno);
        }
    }