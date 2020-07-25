package bai1.pkg3;

import java.util.Scanner;

public class Bai13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a can tim trong mang:");
        int b= input.nextInt();
        int a = 0;
        do {
            System.out.println("Moi nhap so phan tu cua mang :");
            int n = input.nextInt();
            a = n;
        } while (a < 0);
        int[] x = new int[a];
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Nhap phan tu thu %d:", i + 1);
            x[i] = input.nextInt();
        }
        System.out.println("Vi tri cua a la:");
        for (int i = 0; i < x.length; i++) {
            if(x[i]==b)
            {
                System.out.printf("%d ",i+1);
            }
        }

    }
}
