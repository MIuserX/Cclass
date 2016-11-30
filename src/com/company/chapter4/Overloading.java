package com.company.chapter4;

/**
 * Created by Readdy on 2016/11/29.
 * @version 0.0.1 2016/11/29
 * @author weidi.jin
 */
public class Overloading {
    public static void main(String[] args) {
        Overloading ol = new Overloading(1, 2);

        ol.dispValsNTimes('a', 5);
    }

    private int myx, myy;

    Overloading(int x, int y) {
        this.myx = x;
        this.myy = y;
    }

    public void addXY() {
        ++(this.myx);
        ++(this.myy);
    }
/*
    int addXY() {
        ++(this.myx);
        ++(this.myy);
    }
*/

    /**
     *
     * @param fac 这个值将会被加到 myx 和 myy 上
     */
    public void addXY(int fac) {
        this.myx += fac;
        this.myy += fac;
    }

    public static void dispValsNTimes(char ch, int times) {
        for (;times-- > 0;) {
            System.out.println(ch);
        }
    }

    public static void dispValsNTimes(int times, char ch) {
        for (;times-- > 0;) {
            System.out.println(ch);
        }
    }
}
