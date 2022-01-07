package com.lucky.day01;

/**
 * 打印int类型的二进制
 */
public class Code01_PrintB {

    public static void printB(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num&(1<<i))==0?"0":"1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 876234;
        printB(num);
        System.out.println("========================");
        int a = 2898324;
        int b = 234892;
        System.out.println("========================");
        printB(a);
        printB(b);
        System.out.println("========================");
        printB(a);
        printB(b);
        System.out.println("========================");
        printB(a | b);
        System.out.println("========================");
        printB(a & b);
        System.out.println("========================");
        printB(a ^ b);
    }

}
