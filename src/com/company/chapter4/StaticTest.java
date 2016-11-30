package com.company.chapter4;

/**
 * Created by Readdy on 2016/11/29.
 * @version 0.0.1 2016/11/29
 * @author weidi.jin
 */
public class StaticTest {
    private static int lastID = 1;

    private int myID;

    StaticTest() {
        this.myID = this.lastID;
        ++this.lastID;
        ++lastID;
        ++StaticTest.lastID;
    }

    public void dispMyID() {
        System.out.println(myID);
    }
}
