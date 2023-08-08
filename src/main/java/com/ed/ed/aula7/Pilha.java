package com.ed.ed.aula7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Pilha {
    private List<String> list;

    public Pilha() {
        this.list = new LinkedList<String>();
    }

    public String topo() {
        try {
            return this.list.get(list.size() - 1);

        } catch (Exception e) {
            return "Empty List";
        }
    }

    public boolean isVazia() {
        return list.isEmpty();
    }

    public void empilhar(String value) {
        this.list.add(value);
    }

    @Override
    public String toString() {
        return "Pilha [list=" + list + "]";
    }

    public String pop() {
        try {
            return this.list.remove(list.size() - 1);

        } catch (Exception e) {
            return "Empty List";
        }
    }

}
