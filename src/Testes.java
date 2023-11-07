import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    void deveSomarCorretamente_1() {
        Noh nohRaiz = null;
        Arvore arvore = new Arvore();

        nohRaiz = arvore.inserirNoh(nohRaiz, 10);
        arvore.inserirNoh(nohRaiz, 5);
        arvore.inserirNoh(nohRaiz, 15);
        arvore.inserirNoh(nohRaiz, 3);
        arvore.inserirNoh(nohRaiz, 7);
        arvore.inserirNoh(nohRaiz, null);
        arvore.inserirNoh(nohRaiz, 18);

        Assertions.assertEquals(32, arvore.obterSomaDoIntervalo(nohRaiz, 7, 15));
    }

    @Test
    void deveSomarCorretamente_2() {
        Noh nohRaiz = null;
        Arvore arvore = new Arvore();

        nohRaiz = arvore.inserirNoh(nohRaiz, 10);
        arvore.inserirNoh(nohRaiz, 5);
        arvore.inserirNoh(nohRaiz, 15);
        arvore.inserirNoh(nohRaiz, 3);
        arvore.inserirNoh(nohRaiz, 7);
        arvore.inserirNoh(nohRaiz, 13);
        arvore.inserirNoh(nohRaiz, 18);
        arvore.inserirNoh(nohRaiz, 1);
        arvore.inserirNoh(nohRaiz, null);
        arvore.inserirNoh(nohRaiz, 6);

        Assertions.assertEquals(23, arvore.obterSomaDoIntervalo(nohRaiz, 6, 10));
    }
}
