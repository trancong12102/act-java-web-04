
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
public class bai3a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        // nhap vao mang hai chieu A 
        System.out.println("Moi ban nhap gia tri vao mang A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Gia tri cua A[%d][%d]\n", i, j);
                A[i][j] = Integer.parseInt(input.nextLine().trim());
            }
        }
        // In ra mang hai chieu A 
        System.out.printf("\n ");
        System.out.println("Mang A vua nhap la");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "       ");

            }
            System.out.printf("\n");
        }
        // Kiem tra xem ma tran co phai ma tran don vi khong 
        int count1 = 0, count2 = 0;
        for (int i = 0; i < 3; i++) {
            if (A[i][i] == 1) {
                count1 = 1;
            } else {
                count1 = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (A[i][j] == 0 || A[j][i] == 0) {
                    count2 = 1;
                } else {
                    count2 = 0;
                }
            }
        }
          if (count1==1 && count2 == 1){
            System.out.println("Đây là ma trận đơn vị");
        } else {
            System.out.println("Đây không phải là ma trận đơn vị");
        }
    }

}
