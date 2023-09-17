import java.util.Date;

public class Anotacao {

    private Date data;
    private String titulo;
    private String anotacao;

    public Anotacao() {
    }
    public Anotacao(Date data, String titulo, String anotacao) {
        this.data = data;
        this.titulo = titulo;
        this.anotacao = anotacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                " Conteúdo = " + anotacao +
                " Data: " + data + '\n';
    }
}
