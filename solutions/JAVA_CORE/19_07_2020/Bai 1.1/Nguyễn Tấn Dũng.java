package bai1.pkg1;

import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int tongle = 0;
        int tongchan = 0;
        do {
            System.out.println("Moi nhap so phan tu cua mang :");
            int n = input.nextInt();
            a = n;
        } while (a < 0);
        int[] x = new int[a];
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Nhap phan tu thu %d:", i + 1);
            x[i] = input.nextInt();
            sum += x[i];
            if (x[i] % 2 == 1) {
                tongle += x[i];
            }
            if (x[i] % 2 == 0) {
                tongchan += x[i];
            }
        }
        System.out.printf("\nTong %d phan tu la :%d", a, sum);
        System.out.printf("\nTong phan tu le :%d", tongle);
        System.out.printf("\nTong phan tu le :%d", tongchan);
    }
}
