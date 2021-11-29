# JavaProblem
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author 
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class NewClass{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        while (test_cases > 0) {
            int p;
            int n = sc.nextInt();
            int[] Array = new int[n];
            int query = sc.nextInt();
            for (int i = 0; i < Array.length; i++) {
                Array[i] = sc.nextInt();
            }
            if (query == 1) {
                int r = sc.nextInt();
                p = sc.nextInt();
                add_1(Array, r, p);
            } else {
                p = sc.nextInt();
                add_2(Array, p);
            }
            test_cases--;
        }
    }

    public static void add_1(int[] Array, int index, int element) {
        int counter = 0;
        int[] array = new int[Array.length + 1];
        for (int i = 0; i <= Array.length; i++) {
            if (i == index) {
                array[i] = element;
                System.out.print(array[i] + " ");
            } else {
                array[i] = Array[counter];
                System.out.print(array[i] + " ");
                counter++;
            }
        }
    }

    public static void add_2(int[] Array, int p) {
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == p) {
                System.out.println();
                System.out.println(i);
                break;
            } else {
                if (count == Array.length) {
                    System.out.println(-1);
                }
                count++;
            }
        }
    }
}

# JavaProblem

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











