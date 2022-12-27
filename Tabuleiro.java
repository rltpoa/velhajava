import java.util.List;

class Tabuleiro {

    List<List<TabuleiroCasa>> estados = null;

    List<TabuleiroJogada> jogadas = null;

    Tabuleiro(List<TabuleiroCasa> casas) {
        this.estados.add(casas);
    }

    void reiniciar(List<TabuleiroCasa> casas) {
        this.estados.clear();
        this.jogadas.clear();
        this.estados.add(casas);
    }

    void novaJogada(TabuleiroJogada jogada) {
        this.jogadas.add(jogada);
    }

}
