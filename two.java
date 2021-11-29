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
