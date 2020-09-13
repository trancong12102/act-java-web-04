
package String;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        int tong = 0;
        int chan = 0;
        int le = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i);
            n[i-1] = input.nextInt();
            tong = tong + n[i-1];
            if (n[i-1]%2==0){
                chan = chan + n[i-1];
            }
            else {
                le = le + n[i-1];
            }
        }
        System.out.print("Mang la :" );
        for (int name : n){
            System.out.print(name);
        }
        System.out.println("");
        System.out.println("Tong cac phan tu la: " +tong);
        System.out.println("Tong cac phan tu chan la: " +chan);
        System.out.println("Tong cac phan tu le la: " +le);
    }
}
