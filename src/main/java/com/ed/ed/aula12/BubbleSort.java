package com.ed.ed.aula12;

public class BubbleSort {

    public int[] ordenar(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    var aux1 = arr[j];
                    var aux2 = arr[i];
                    arr[i] = aux1;
                    arr[j] = aux2;
                }
            }
        }
        return arr;
    }

}
