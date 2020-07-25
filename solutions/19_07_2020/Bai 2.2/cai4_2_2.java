/*
2. Nhập vào 2 Ma trận 3x3. Tính 
a. Tổng của 2 Ma trận 
b. Tích của 2 Ma trận 
c. Tính định thức của Ma trận
 */
package bai4;

import java.util.Scanner;

public class cai4_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nhap ma tran A
        int [][] A = new int[3][3];
        System.out.println("Nhap ma tran A ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Nhap A[%d][%d]= ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        //Nhap ma tran B
        int [][] B = new int[3][3];
        System.out.println("Nhap ma tran B ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Nhap B[%d][%d]= ",i,j);
                B[i][j] = input.nextInt();
            }
        }
        //In ra ma tran C=A+B
        int [][] C = new int[3][3];
        System.out.println("Ma tran C=A+B ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j] = A[i][j]+B[i][j];
                System.out.printf("%d   ",C[i][j]);
            }
            System.out.println("\n");
        }
        //In ra ma tran D=A*B
        int [][] D = new int[3][3];
        System.out.println("Ma tran D=A*B ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
            int sum = 0;
                for (int k = 0; k <3; k++) {
                sum = sum + A[i][k] * B[k][j];
                }
                D[i][j] = sum;
                System.out.printf("%d   ",D[i][j]);
            }
            System.out.println("\n");
        }
        int x =0;
        int y =0;
        int z =0;
        int detA= 0;
        x = A[0][0]*(A[1][1]*A[2][2]-A[2][1]*A[1][2]);
        y = A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0]);   
        z = A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);
        detA = x+y+z;
        System.out.println("Dinh thuc ma tran A= "+detA);
    }
}
