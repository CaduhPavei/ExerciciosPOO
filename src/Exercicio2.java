import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {

        //SwitchCase
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite um número entra 1 e 7:");
        int dia=scan.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("?");
                break;
        }

        //While

        int x=10;
        while (x<=20){
            System.out.println("Valor "+x);
            x++;
        }


        DoWhile
        int y=10;
        do {
            System.out.println("Valor " + y);
            x++;
        } while (y<20);

        //CalculoTrapesio
        double h=1.4;
        double b=3.1;
        double B=5.0;
        double trapesio;
        trapesio=(h*(b+B))/2;
        System.out.println(trapesio);



    }
}
