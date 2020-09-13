
package String;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        int max = 0;
        int min = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i);
            n[i-1] = input.nextInt();
            if (i==1){
                max = n[i-1];
                min = n[i-1];
            }
            if (n[i-1] > max){
                max = n[i-1];
            }
            if (n[i-1] < min){
                min = n[i-1];
            }
        }
        System.out.println("So lon nhat trong mang la: " +max);
        System.out.println("So nho nhat trong mang la: " +min);
        System.out.print("Cac phan tu chia het cho 3 co trong mang la: ");
        for (int i = 1; i <= 5; i++) {
            if (n[i-1]%3==0){
                System.out.printf("%d ",n[i-1]);
            }
        }
    }
}
