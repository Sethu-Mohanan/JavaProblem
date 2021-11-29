/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int m = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (m > 0) {
            System.out.println("Enter Q: ");
            int n = sc.nextInt();
            System.out.println("Enter N: ");
            int q = sc.nextInt();

            for (int i = 0; i < n; i++) {

                arr.add(sc.nextInt());
            }
            if (q == 1) {
                int r = sc.nextInt();

                int p = sc.nextInt();

                if (p < arr.size()) {
                    arr.add(p, r);
                }
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i) + " ");
                }
            }
            if (q == 2) {
                int check = sc.nextInt();

                System.out.print("hii :"+arr.lastIndexOf(check));

            }
            m--;
        }
    }
}
//https://practice.geeksforgeeks.org/problems/java-arraylist5312/0/?category[]=Java&category[]=Java&page=1&query=category[]Javapage1category[]JAva
