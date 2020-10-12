package com.example.algorithm.bubblesort;

/**
 * @program: algorithm->BubbleSort
 * @description: 冒泡排序
 * @author: hunyiha
 * @create: 2020-10-13 00:27
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] params = {231,442,52,77,23,234, 124,330};
        bubbleSort(params);
        for (int param : params) {
            System.out.println(param);
        }
    }

    private static void bubbleSort(int[] params) {
        int length = params.length;
        for (int i = 0; i < length -1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if(params[j] > params[j+1]){
                    int temp = params[j+1];
                    params[j+1] = params[j];
                    params[j] = temp;
                }
            }
        }
    }
}
