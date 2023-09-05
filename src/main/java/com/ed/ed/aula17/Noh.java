package com.ed.ed.aula17;

public class Noh {

    public int value;
    public Noh pai;
    public Noh irmaoDireito;
    public Noh filhoEsquerdo;

    public Noh(int value) {
        this.value = value;
        this.pai = null;
        this.irmaoDireito = null;
        this.filhoEsquerdo = null;
    }

    public Noh(int value, Noh pai) {
        this.value = value;
        this.pai = pai;
        pai.filhoEsquerdo = this;
        this.irmaoDireito = null;
        this.filhoEsquerdo = null;
    }

    public void add(Noh filho) {
        if (this.filhoEsquerdo == null) {
            this.filhoEsquerdo = filho;
        } else {
            var aux = this.filhoEsquerdo;
            while (aux.irmaoDireito != null) {
                aux = aux.irmaoDireito;
            }
            aux.irmaoDireito = filho;
        }
        filho.pai = this;
    }

}
