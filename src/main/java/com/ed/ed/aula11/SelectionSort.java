package com.ed.ed.aula11;

public class SelectionSort {

    public int[] ordenar(int[] arr) {
        int n = arr.length;

        for (var i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (var j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            var temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
