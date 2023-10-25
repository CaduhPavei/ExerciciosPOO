package Aula11;

public class Materia {

    private String nome;
    private String descricao;
    private String indicadorEssencial;
    private String indicadores;
    private String conteudo;
    private String planoDeAula;

    public Materia() {

    }

    public Materia(String nome, String descricao) {
        this(nome, descricao, null);
    }

    public Materia(String nome, String descricao, String indicadorEssencial) {
        this(nome, descricao, indicadorEssencial, null, null);
    }

    public Materia(String nome, String descricao, String indicadorEssencial, String indicadores, String conteudo) {
        this(nome, descricao, indicadorEssencial, indicadores, null,null);
    }

        public Materia(String nome, String descricao, String indicadorEssencial, String indicadores, String conteudo, String planoDeAula){
            this.nome = nome;
            this.descricao = descricao;
            this.indicadorEssencial = indicadorEssencial;
            this.indicadores = indicadores;
            this.conteudo = conteudo;
            this.planoDeAula = planoDeAula;
        }
    }