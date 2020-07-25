/*
 5. Nhập vào 2 Vector 3 chiều A(xa, ya, za) và B(xb, yb, zb). Tính 
a. Tổng của 2 vector 
b. Tính tích vô hướng của 2 vector
 */
package bai4;

import java.util.Scanner;


/**
 *
 * @author King Midas
 */
public class bai4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        System.out.print("Nhap vecto A ");
        for (int i = 0; i < A.length; i++){
            A[i] = input.nextInt();
        }
        System.out.print("Nhap vecto B ");
        for (int i = 0; i < A.length; i++){
            A[i] = input.nextInt();
        }
        int[] C = new int[3];
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] + B[i];
        }
        System.out.print("Tong hai vecto A va B");
        for (int i = 0; i < C.length; i++){
            System.out.printf(" %d\n",C[i]); 
        }
        int Tichvohuong=0;
        for (int i = 0; i < C.length; i++){
        Tichvohuong+= A[i]*B[i];   
        }System.out.println("Tich vo huong "+ Tichvohuong);
    }
}