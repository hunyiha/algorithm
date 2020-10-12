package com.example.algorithm.binarysearch;

import javafx.scene.effect.Light;

import java.sql.SQLOutput;

/**
 * @program: algorithm->BinarySearch
 * @description: 二分查找
 * @author: hunyiha
 * @create: 2020-10-12 22:58
 **/
public class BinarySearch {

    public static void main(String[] args) {

        int[] params = {23,44,52,77,100,234, 312,412};
        int num = 412;
        int index = binarySearch(params, num);
        System.out.println(num + "在数组中的索引:" + index);
    }

    private static int binarySearch(int[] params, int num) {

        int head = 0;
        int tail = params.length-1;
        int middle;

        while(head <= tail){
            middle = (head + tail) / 2;

            if (num > params[middle]){
                head = middle + 1;
            }else if (num < params[middle]) {
                tail = middle -1;
            }else{
                return middle;
            }
        }

        throw new RuntimeException("数组中不存在这个数");
    }
}
