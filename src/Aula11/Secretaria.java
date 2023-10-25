package Aula11;

public class Secretaria extends Funcionario {

    private Double bonus;
    private Double salarioContratual;
    private Double salarioFamilia;
    private Double horasExtras;

    @Override
    public Double getSalario() {
        return (salarioContratual + salarioFamilia + bonus + horasExtras);
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getSalarioContratual() {
        return salarioContratual;
    }

    public void setSalarioContratual(Double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public Double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(Double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Secretaria(){

    }

    public Secretaria(Double bonus, Double salarioContratual){
        this(bonus, salarioContratual, null, null);
    }

    public Secretaria(Double bonus, Double salarioContratual, Double salarioFamilia){
        this(bonus, salarioContratual, salarioFamilia, null);
    }

    public Secretaria(Double bonus, Double salarioContratual, Double salarioFamilia, Double horasExtras) {
        this.bonus = bonus;
        this.salarioContratual = salarioContratual;
        this.salarioFamilia = salarioFamilia;
        this.horasExtras = horasExtras;
    }
}
