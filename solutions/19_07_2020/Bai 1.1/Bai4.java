/*
1. Nhập vào mảng số Nguyên 5 phần tử. In ra mảng vừa nhập và
a. Tính tổng các phần tử trong mảng.
b. Tính tổng các phần tử lẻ.
c. Tính tổng các phần tử chẵn.
 */
package bai4;

import java.util.Scanner;
public class Bai4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] A = new int[5];
        int s =0;
        int s1 =0;
        int s2 =0;
        for(int i=0;i<5;i++){
                System.out.printf("Nhap A[%d]= ",i);
                A[i] = input.nextInt();
                s+= A[i];
                if (A[i]%2==1){
                    s1+=A[i];
                }
                if (A[i]%2==0){
                    s2+=A[i];
                }
            }
            System.out.println("Tong cac phan tu trong mang s= "+s);
            System.out.println("Tong cac phan tu le trong mang s= "+s1);
            System.out.println("Tong cac phan tu chan trong mang s= "+s2);

    }
}