package com.ed.ed.aula17;

public class Arvore {
    static String[] arvore = { "A", "B", "C", "D", "E", "F", "G", "H" };

    public static int calcularIndiceFilhoEsquerdo(int indiceDoPai) {
        return (indiceDoPai + 1) * 2 - 1;
    }

    public static int calcularIndiceirmaoDireito(int indiceDoPai) {
        return calcularIndiceFilhoEsquerdo(indiceDoPai) + 1;
    }

    public static int calcularIndicePai(int indiceDoFilho) {
        return (indiceDoFilho - 1) / 2;
    }

    public static int calcularAltura(String[] arvore) {
        return (int) (Math.log(arvore.length) / Math.log(2));
    }

    public static void main(String[] args) {
        System.out.println("Filhos esquerdos");
        for (int i = 0; i < arvore.length; i++) {
            int indiceFilhoEsquerdo = calcularIndiceFilhoEsquerdo(i);
            try {
                String filhoEsquerdo = arvore[indiceFilhoEsquerdo];
                System.out.println(arvore[i] + " tem filho esquerdo " + filhoEsquerdo);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(arvore[i] + " é folha, sem filho esquerdo");
            }
        }

        System.out.println("############## Filhos direitos");
        for (int i = 0; i < arvore.length; i++) {
            int indiceirmaoDireito = calcularIndiceirmaoDireito(i);
            try {
                String irmaoDireito = arvore[indiceirmaoDireito];
                System.out.println(arvore[i] + " tem filho direito " + irmaoDireito);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(arvore[i] + " é folha, sem filho direito");
            }
        }

        System.out.println("############## Pais");
        for (int i = 0; i < arvore.length; i++) {
            int indicePai = calcularIndicePai(i);
            if (indicePai == -1) {
                System.out.println(arvore[i] + " não tem pai, pois é raiz");
            } else {
                String pai = arvore[indicePai];
                System.out.println(arvore[i] + " tem pai " + pai);
            }
        }

        int altura = calcularAltura(arvore);
        System.out.println("######### Altura");
        System.out.println(altura);
    }

}
