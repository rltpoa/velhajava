import java.util.List;

class VelhaJogador {

    String nome = null;

    VelhaPeça peça = null;

    public List<TabuleiroJogada> fazJogada() {
        return null;
    }

    VelhaJogador(String nome, String tipo) {
        this.nome = nome;
        VelhaPeça peça = new VelhaPeça(tipo);
        this.peça = peça;
    }

}
