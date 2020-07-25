/*
3. Nhập vào mảng số Nguyên 5 phần tử và 1 số nguyên a từ bản phím. Kiểm tra hem số
Nguyên a có xuất hiện trong mảng không. Nếu có in ra vị trí của số đó trong mảng.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a=  ");
        int a = input.nextInt();
        int [] A = new int[5];
        int count = 0;
        for(int i=0;i<5;i++){
                System.out.printf("Nhap A[%d]= ",i);
                A[i] = input.nextInt();
                if(A[i]==a){
                    System.out.printf("So nguyen [%d] xuat hien trong mang",a);
                    count = i+1;
                    System.out.println("Vi tri trong mang"+count);
                    break;
                }
    }
    }
}
