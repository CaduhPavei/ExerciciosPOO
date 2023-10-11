package Aula10.Sobrescrever;

public class Aluno extends Pessoa {

    private Integer mediaGeral = 0;

    public Aluno() {
    }

    public Integer getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Integer mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "mediaGeral=" + mediaGeral +
                '}';
    }
}
