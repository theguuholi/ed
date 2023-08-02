package com.ed.ed.aula5;

public class Node {

    public Integer value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }

    

}
