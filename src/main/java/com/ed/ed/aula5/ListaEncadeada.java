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
        add(value, length);
    }

    public void add(int value, int index) {

        if (index == 0) {
            this.firstNode = new Node(value, this.firstNode);
            length++;
            return;
        } else if (index == length) {
            length++;

            var node = new Node(value);

            if (this.firstNode == null) {
                this.firstNode = node;
                return;
            } else {
                var lastNode = this.firstNode;

                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = node;
            }
        } else {
            var actualIndex = 0;
            var actualNode = this.firstNode;

            while (actualIndex <= index) {
                System.out.println(this.firstNode);
                if (actualIndex == index) {
                    var node = new Node(value, actualNode);
                    this.firstNode.next = node;
                    break;
                }
                actualIndex++;
                actualNode = actualNode.next;
            }
        }

    }

    public Integer get(int index) {
        if (this.firstNode == null)
            throw new NullPointerException("There is no node");
        if (index == 0) {
            return this.firstNode.value;
        }

        var actualLengh = 1;
        Node node = this.firstNode.next;
        while (actualLengh != index) {
            node = node.next;
            actualLengh++;
        }
        return node.value;
    }

}