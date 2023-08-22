package Aula4;
import javax.swing.*;
public class Exercicio4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome","Entrada",JOptionPane.QUESTION_MESSAGE);
        String nome2 = JOptionPane.showInputDialog(null,"Digite seu nome","Entrada",JOptionPane.QUESTION_MESSAGE);
        String nomeCompleto = nome+" "+nome2;
        JOptionPane.showMessageDialog(null,nomeCompleto,"Nome Completo",JOptionPane.INFORMATION_MESSAGE);
    }
}
