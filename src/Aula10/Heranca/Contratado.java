package Aula10.Heranca;

public class Contratado extends Pessoa{

    private Double salario;
    private String matricula;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "nome='" + super.getNome() + '\'' +
                "salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
