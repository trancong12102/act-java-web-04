
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DaiPhongPC
 */
public class bai1 {
     public static void main(String[] args) {
        int[][] A = new int[3][3];
        Scanner input = new Scanner(System.in);
        // Nhập mảng A 
        System.out.println("Moi nhap mang:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(input.nextLine().trim());

            }
        }
        // In ra mảng A 
        System.out.println("Mang vua nhap co dang la");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.print("\n");
        }
        // Tính tổng mỗi cột 
        for (int i = 0; i < 3; i++) {
            int scol = 0;
            for (int j = 0; j < 3; j++) {
                scol = scol + A[j][i];
            }
            System.out.printf("\n Cot thu %d co tong la: %d", i, scol);
        }
        // Tính tổng mỗi hàng
        for (int i=0; i<3;i++){
            int srow = 0; 
            for(int j=0; j<3; j++){
                srow = srow + A[i][j]; 
            }
            System.out.printf("\n Dong thu %d co tong la: %d",i,srow);
        }
}
