
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
public class bai3c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        // Nhap vao mang hai chieu A 
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
        // Ma tran doi xung la ma tran co cac phan tu doi xung bang nhau 
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] != A[j][i]) {
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Đây là ma trận đối xứng");
        }
        else{
            System.out.println("Đây không phải là ma trận đối xứng");
        }

    }

}
