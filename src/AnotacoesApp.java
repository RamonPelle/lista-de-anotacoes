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

    public void removeAnotacao (Integer anotacao){
        this.anotacoes.remove(this.anotacoes.get(anotacao));
    }

    public void editaAnotacao(Anotacao anotacao, Anotacao anotacaoEditada){
        anotacoes.add(anotacoes.indexOf(anotacao), anotacaoEditada);
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    @Override
    public String toString() {
        return "Anotacoes registradas: \n" + anotacoes;
    }
}
