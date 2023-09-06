package Aula06.Documento;

import java.time.LocalDate;

public class DocumentoMain {
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.codigo = 123456;
        doc1.nome = "Alfredo";
        doc1.foto = "Img1.png";
        doc1.dataNascimento = LocalDate.of(1961,11,30);

        Documento doc2 = new Documento();
        doc2.codigo = 456789;
        doc2.nome = "Genésio";
        doc2.foto = "Img2.png";
        doc2.dataNascimento = LocalDate.of(1949,2,21);
//        Documento doc2 = doc1;//NÃO FAÇA ISSO! Sobrescreverá a informação inserida anteriormente no objeto.

        System.out.println(doc1);
        System.out.println(doc2);
        System.out.println(doc2.nome);

    }
}