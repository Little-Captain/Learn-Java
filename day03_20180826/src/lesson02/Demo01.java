package lesson02;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        System.out.println(x);
        int week = 2;
        // default 必须放在最后面, 放在其他位置不会执行
        switch (week) {
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
        case 3:
            System.out.println(3);
        default:
            System.out.println("default");
        }
    }

}
