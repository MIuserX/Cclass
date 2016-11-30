package com.company.chapter4;

/**
 * Created by Readdy on 2016/11/29.
 * @version 0.0.1
 * @update  2016/11/29
 * @author  weidi.jin
 */
public class CallBy {
    public static void main(String[] args) {
        int ival = 10;
        MultiVals mvs = new MultiVals(3, 4d);

        System.out.println("Before *3:");
        System.out.println("ival="+ival);
        mvs.dispVals();

        ValueTest.threeVal(ival);
        MultiVals.threeRef(mvs);

        System.out.println("After *3:");
        System.out.println("ival="+ival);
        mvs.dispVals();
    }
}

class ValueTest {

    public static void threeVal(int x) {
        x = x * 3;
    }
}

class MultiVals {
    private int myX = 1;
    private double myY = 2d;

    MultiVals(int x, double y) {
        myX = x;
        myY = y;
    }

    public void dispVals() {
        System.out.println("x="+this.myX+" y="+this.myY);
    }

    public static void threeRef(MultiVals m) {
        m.myX *= 3;
        m.myY *= 3;
    }
}