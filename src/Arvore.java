public class Arvore {

    public Arvore() {
    }

    public Noh inserirNoh(Noh node, Integer data) {
        if (node == null)
            return new Noh(data);

        if (data == null || data <= node.getValor()) {
            node.setEsq(inserirNoh(node.getEsq(), data));
        } else {
            node.setDir(inserirNoh(node.getDir(), data));
        }

        return node;
    }

    public int obterSomaDoIntervalo(Noh noh, int inicio, int fim) {
        int soma = 0;

        if (noh == null){
            return 0;
        }

        if (noh.getValor() >= inicio && noh.getValor() <= fim) {
            soma += noh.getValor() == null ? 0 : noh.getValor();
        }

        if (noh.getValor() > inicio) {
            soma += obterSomaDoIntervalo(noh.getEsq(), inicio, fim);
        }

        if (noh.getValor() < fim) {
            soma += obterSomaDoIntervalo(noh.getDir(), inicio, fim);
        }

        return soma;
    }

}
