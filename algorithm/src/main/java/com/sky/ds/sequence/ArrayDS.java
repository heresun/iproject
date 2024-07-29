package com.sky.ds.sequence;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组数据结构
 */
public class ArrayDS {

    /**
     * 初始化制定长度的素组
     * @param length 数组长度
     * @return 返回值
     */
    public static int[] initArray(int length) {
        return new int[length];
    }

    public static void add(int[] arr, int num, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        for (int i = arr.length - 1; i > index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
    }

    public static void main(String[] args) {
        int[] array = initArray(10);
        add(array, 10, 2);
        add(array, 1, 1);
        System.out.println(Arrays.toString(array));

    }
}
