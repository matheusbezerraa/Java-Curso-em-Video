package arvorebinaria;
public class ArvoreBinaria {
    public static void main(String[] args) {
        Arvore ab = new Arvore(null);
        ab.inserir(15);
        ab.inserir(8);
        ab.inserir(15);
        ab.inserir(2);
        ab.inserir(12);
        ab.inserir(20);
        ab.inserir(30);
        ab.imprimirArvore();
    }
}
