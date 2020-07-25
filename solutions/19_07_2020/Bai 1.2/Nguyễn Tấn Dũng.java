package bai1.pkg2;

import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int min=10000000;
        int max=0;
        do {
            System.out.println("Moi nhap so phan tu cua mang :");
            int n = input.nextInt();
            a = n;
        } while (a < 0);
        int[] x = new int[a];
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Nhap phan tu thu %d:", i + 1);
            x[i] = input.nextInt();
            if(x[i]<min)
            {
                min=x[i];
            }
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        System.out.println("So lon nhat la:"+max);
        System.out.println("So nho nhat la :"+min);
        System.out.println("Cac phan tu chia het cho 3 la:");
        for (int i = 0; i < x.length; i++) {
            if(x[i]%3==0)
            {
                System.out.printf("%d",x[i]);
            }
        }

    }
}
