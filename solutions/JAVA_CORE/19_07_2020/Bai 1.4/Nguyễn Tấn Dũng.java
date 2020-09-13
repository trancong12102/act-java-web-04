package bai1.pkg4;

import java.util.Scanner;
import java.util.Random;

public class Bai14 {

    public static void main(String[] args) {
        int c = 0;
        int demle = 0;
        int demchan = 0;
        Random rd = new Random();
        int[] x = new int[15];
        System.out.println("Day so Random la:");
        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt();
            System.out.println("" + x[i]);
            if (x[i] % 2 == 0) {
                    demchan++;
                } else {
                    demle++;
                }
        }
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    c = x[i];
                    x[i] = x[j];
                    x[j] = c;
                }
            }
        }
        System.out.println("Chuoi tang dan la:");
        {
            for (int i = 0; i < x.length; i++) {
                System.out.println("" + x[i]);
            }
        }
        System.out.println("Chuoi giam dan la:");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("" + x[i]);
        }
        System.out.println("Sỗ chẵn:" + demchan);
        System.out.println("Số lẻ:" + demle);
    }
}
