package Aula05;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("Digite um valor a ser calculado: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro valor: ");
        int num2 = scan.nextInt();
        System.out.println("Selecione o tipo de operação: ");
        System.out.println("1-Soma\t\t2-Subtração");
        System.out.println("3-Multiplicação\t\t4-Divisão");
        int tipo = scan.nextInt();
            switch (tipo) {
                case 1 -> {
                    int soma = num1 + num2;
                    System.out.println("A soma resultou em: " + soma);
                }
                case 2 -> {
                    int subtra = num1 - num2;
                    System.out.println("A subtração resultou em " + subtra);
                }
                case 3 -> {
                    int multi = num1 * num2;
                    System.out.println("A multiplicação resultou em: " + multi);
                }
                case 4 -> {
                    double divi = num1 / num2;
                    System.out.println("A divisão resultou em: " + divi);
                }
            }
        }catch (ArithmeticException e){
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }
    }
}
