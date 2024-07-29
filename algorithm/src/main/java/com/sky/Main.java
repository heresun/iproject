package com.sky;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = -0;

        System.out.println(a == b);
//        long l = System.currentTimeMillis();
//
//        System.out.println(testO(100));
//
//        System.out.println(System.currentTimeMillis() - l);


    }


    public static int testO(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += testO(n - 1);
        }
        return count;
    }
}
