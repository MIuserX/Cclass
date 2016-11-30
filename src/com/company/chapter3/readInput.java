package com.company.chapter3;

import java.util.Scanner;

/**
 * Created by Readdy on 2016/11/30.
 * @version 0.0.1 2016/11/30
 * @author weidi.jin
 */
public class readInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer iarr[] = new Integer[10];

        for (int i = 0; i < 10; ++i) {
            iarr[i] = in.nextInt();
        }

        for (int x : iarr) {
            System.out.print(x+" ");
        }
    }
}
