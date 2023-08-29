package Aula05;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        int i, menor=99999999, maior=0, soma=0;
        lista.add(15);
        lista.add(22);
        lista.add(33);
        lista.add(47);
        lista.add(54);
        lista.add(66);
        lista.add(79);
        lista.add(81);
        lista.add(90);
        lista.add(100);

        System.out.println("Elementos da lista: ");
        for(i=0;i<lista.size();i++){
            if (lista.get(i)<menor){
                menor=lista.get(i);
            }
            if (lista.get(i)>maior){
                maior= lista.get(i);
            }
            System.out.println("Elemento " + i + ": " + lista.get(i));
            soma+=lista.get(i);
        }

        double media=soma/lista.size();
        System.out.println("O menor elemento da lista é: "+menor);
        System.out.println("O maior elemento da lista é: "+maior);
        System.out.println("A média dos valores da lista é: "+media+"\n");
        System.out.println("Elementos pares: ");
        for(i=0;i< lista.size();i++){
            if(lista.get(i)%2==0){
                System.out.println(lista.get(i));
            }
        }

    }
}
