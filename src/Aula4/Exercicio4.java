package Aula4;
import javax.swing.*;
public class Exercicio4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome","Entrada",JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,"Digite seu nome","Entrada",JOptionPane.QUESTION_MESSAGE);
        String nomeCompleto = nome+" "+sobrenome;
        JOptionPane.showMessageDialog(null,nomeCompleto,"Nome Completo",JOptionPane.INFORMATION_MESSAGE);
    }
}
