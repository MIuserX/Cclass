package com.company.chapter3;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Readdy on 2016/11/30.
 * @version 0.0.1 2016/11/30
 * @author weidi.jin
 */
public class readFile {
    public static void main(String[] args) {
        File file = new File("d:\\Overloading.java");
        try {
            Scanner in = new Scanner(file);
            int effectiveLineCount = 0;

            while (true) {
                if (in.hasNextLine()) {
                    System.out.println(in.nextLine());
                    String aLine = in.nextLine();
                    if (true) {
                        ++effectiveLineCount;
                    }
                }
                else {
                    break;
                }
            }

            System.out.println("total: " + effectiveLineCount + " lines");
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("File \""+file.getName()+"\" not found!");
            System.out.println("The following are Stack msg:");
            e.printStackTrace();
        }
    }
}
