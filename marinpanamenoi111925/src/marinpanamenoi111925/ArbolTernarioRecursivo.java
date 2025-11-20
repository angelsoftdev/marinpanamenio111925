/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinpanamenoi111925;

/**
 *
 * @author angel
 */
public class ArbolTernarioRecursivo {
    public Nodo raiz;

    public ArbolTernarioRecursivo() {
        this.raiz = null;
    }

    public void crearArbolEjemplo() {
        raiz = new Nodo("A");

        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");
        B.hijo1 = E;
        B.hijo2 = F;
        B.hijo3 = G;

        Nodo H = new Nodo("H");
        Nodo I = new Nodo("I");
        Nodo J = new Nodo("J");
        C.hijo1 = H;
        C.hijo2 = I;
        C.hijo3 = J;

        Nodo K = new Nodo("K");
        Nodo L = new Nodo("L");
        Nodo M = new Nodo("M");
        D.hijo1 = K;
        D.hijo2 = L;
        D.hijo3 = M;

        raiz.hijo1 = B;
        raiz.hijo2 = C;
        raiz.hijo3 = D;
    }

    public String preOrden() {
        StringBuilder sb = new StringBuilder();
        preOrdenRec(raiz, sb);
        return sb.toString().trim();
    }

    private void preOrdenRec(Nodo nodo, StringBuilder sb) {
        if (nodo == null) return;
        sb.append(nodo.dato).append(" ");
        preOrdenRec(nodo.hijo1, sb);
        preOrdenRec(nodo.hijo2, sb);
        preOrdenRec(nodo.hijo3, sb);
    }

    public String inOrden() {
        StringBuilder sb = new StringBuilder();
        inOrdenRec(raiz, sb);
        return sb.toString().trim();
    }

    private void inOrdenRec(Nodo nodo, StringBuilder sb) {
        if (nodo == null) return;
        inOrdenRec(nodo.hijo1, sb);
        sb.append(nodo.dato).append(" ");
        inOrdenRec(nodo.hijo2, sb);
        inOrdenRec(nodo.hijo3, sb);
    }

    public String postOrden() {
        StringBuilder sb = new StringBuilder();
        postOrdenRec(raiz, sb);
        return sb.toString().trim();
    }

    private void postOrdenRec(Nodo nodo, StringBuilder sb) {
        if (nodo == null) return;
        postOrdenRec(nodo.hijo1, sb);
        postOrdenRec(nodo.hijo2, sb);
        postOrdenRec(nodo.hijo3, sb);
        sb.append(nodo.dato).append(" ");
    }
}
