package Aula10.Heranca;

public class Funcionario extends Contratado{
    private String cargo;

    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.getNome() + '\'' +
                "cargo='" + cargo + '\'' +
                ", salario=" + super.getSalario() +
                '}';
    }
}
