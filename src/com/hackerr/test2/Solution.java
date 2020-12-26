package com.hackerr.test2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        /* 
         * At this point, the scanner is still on the second line at the end
         * of the double, so we need to move the scanner to the next line
         * scans to the end of the previous line which contains the double. 
         */
        scan.nextLine();
        
        // reads the complete next line which contains the string sentence
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();  
    }
}