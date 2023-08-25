import java.util.ArrayList;
import java.util.List;

public class AnotacoesApp {

    private List<Anotacao> anotacoes = new ArrayList();

    public AnotacoesApp() {
    }

    public AnotacoesApp(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public void addAnotacao(Anotacao anotacao) {
        this.anotacoes.add(anotacao);
    }

    public void removeAnotacao (Anotacao anotacao){
        this.anotacoes.remove(anotacao);
    }

    public void editaAnotacao(Anotacao anotacao, Anotacao anotacaoEditada){
        anotacoes.add(anotacoes.indexOf(anotacao), anotacaoEditada);
    }

    @Override
    public String toString() {
        return "Anotacoes registradas: \n" + anotacoes;
    }
}
