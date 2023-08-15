package Aula4;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String frase = "Essa é a frase que deverá ser testada até a exaustão!";
//        System.out.println("Escreva uma frase");
//        String frase= scan.nextString();

        int qtdChar = frase.length();
        System.out.println("Tamanho da string: "+qtdChar);
        if(qtdChar>50){
            System.out.println("Frase longa!");
        }else{
            System.out.println("Frase curta!");
        }

        String frase2 = "Desenvolvimento é muito legal!";
        String frase3 = frase2.replace("Desenvolvimento","Programação");
        System.out.println("Antes do 'replace': "+frase2);
        System.out.println("Depois do 'replace': "+frase3);
//        System.out.println(frase2.replace("Desenvolvimento","Programação"));

        String maiusculas = frase2.toUpperCase();
        System.out.println(maiusculas);



    }
}
