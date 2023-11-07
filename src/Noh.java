public class Noh {
    private Integer valor;
    private Noh esq;
    private Noh dir;

    public Noh(Integer item) {
        this.valor = item;
        this.esq = null;
        this.dir = null;
    }

    public Noh getEsq() {
        return esq;
    }

    public Noh getDir() {
        return dir;
    }

    public Integer getValor() {
        return valor;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }
}
