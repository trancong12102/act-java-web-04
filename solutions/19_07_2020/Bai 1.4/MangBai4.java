package mangbai4;

import java.util.Random;
import java.util.Scanner;

public class MangBai4 {

    public static void main(String[] args) {

        int[] x = new int[15];
        Random input = new Random();
        System.out.println("Cac phan tu trong day so Random la:");
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
        }
        for (int i : x) {
            System.out.println(i);
        }

        //sap xep mang theo thu tu tang dan
        int temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println("Day so Random sau khi duoc sap xep tang dan la:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("" + x[i]);
        }

        //sap xep mang theo thu tu giam dan
        System.out.println("Day so Random sau khi duoc sap xep giam dan la:");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("" + x[i]);
        }

        //dem chu so chan, so le
        int demle = 0;
        int demchan = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                demchan++;
            } else {
                demle++;
            }
        }
        System.out.println("Chu so chan:" + demchan);
        System.out.println("CHu so le:" + demle);
    }

}
