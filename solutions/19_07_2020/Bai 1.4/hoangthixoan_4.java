/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = new int[15];

        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            arr[i] = rd.nextInt();

        }
        for (int i : arr) {
            System.out.println(i + " ");

        }
        // day tang dan
        int incr;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    incr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = incr;
                }

            }
        }

        System.out.println("day so co gia tri tang dan la:");
        for (int i = 0; i < 15; i++) {
            System.out.println(arr[i] + " ");
        }
        // day giam dan
        int decr;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    decr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = decr;

                }

            }
        }
        System.out.print("day so co gia tri giam dan la:");
        for (int i = 0; i < 15; i++) {

            System.out.println(arr[i] + " ");

        }
        //bao nhieu so chan, so le
        int demc = 0, deml = 0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0) {
                demc = demc + 1;

            } else
            if (arr[i] % 2 !=0){
                deml = deml + 1;

            }
        }
        System.out.print("So cac so chan la: " + demc);
        System.out.print("So cac so le la: " + deml);

    }
    // in ra xem co bn so chan , so le

}
