package com.ed.ed.aula5;

// Listas com alocacao dinamica de memoria
// nao ocupam posicao contigua em memoriaBaseado em estrutura de No
// Cada no guarda um valor e referencia para um ou mais nos
// Lista Simplesseie 
// Lista Circular
// Lista duplamente ligada

public class ListaEncadeada {

    public Integer length = 0;
    public Node firstNode = null;

    public void add(int value) {
        var node = new Node(value);
        if(this.firstNode == null) {
            this.firstNode = node;
            length++;
            return ;
        }
        var lastNode = this.firstNode;

        while(lastNode.next != null) {
            System.out.println(lastNode.toString());
            lastNode = lastNode.next;
        }
        lastNode.next = node;
        length++;
    }

    public Integer get(int index) {
        if (this.firstNode == null)
            throw new NullPointerException("There is no node");
        if(index == 0) {
            return this.firstNode.value;
        }

        var actualLengh = 1;
        Node node = this.firstNode;
        while(actualLengh == index) {
            node = this.firstNode.next;
            actualLengh++;
        }
        return node.value;
    }

}