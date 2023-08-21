package com.ed.ed.aula9;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    List<Integer> queue = new ArrayList<>();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Integer length() {
        return 0;
    }

    public void deque(int value) {
        this.queue.add(value);
    }

    public Integer first() {
        return queue.get(0);
    }

    public Integer desenfileirar() {
        return this.queue.remove(0);
    }
    
}
