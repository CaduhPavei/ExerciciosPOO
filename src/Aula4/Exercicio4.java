package Aula4;
import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
//        System.out.println(inteiro);
        Integer inteiro2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
//        System.out.println(inteiro2);
        int soma=inteiro2+inteiro;
        JOptionPane.
                showMessageDialog(null,"O resultado da soma é: "+soma,"Calculo",JOptionPane.INFORMATION_MESSAGE);


    }
}
