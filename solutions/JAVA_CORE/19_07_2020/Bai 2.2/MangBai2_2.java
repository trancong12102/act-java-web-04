package mangbai2_2;

import java.util.Scanner;
public class MangBai2_2 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        //Nhap ma tran A va B
        System.out.println("Vui long nhap ma tran A :");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf(" A[%d][%d] = ",i+1,j+1);
                A[i][j]= input.nextInt();
            }
        }
        
        System.out.println("Vui long nhap ma tran B :");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.printf(" B[%d][%d] = ",i+1,j+1);
                B[i][j]= input.nextInt();
            }
        }
        
        //xuat ma tran
        System.out.println("\nMa tran A vua nhap:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("\t%d\t",A[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("\nMa tran B vua nhap:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.printf("\t%d\t",B[i][j]);
            }
            System.out.println("");
        }
        
        //tong hai ma tran
        int [][] C= new int[3][3];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        System.out.println("\nTong hai ma tran la C :");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.printf("\t%d\t",C[i][j]);
            }
            System.out.println("");
        }
    
        //tich hai ma tran A va B
        int [][] D= new int[3][3];
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                D[i][j]+= A[i][j] * B[i][j];
            }
        }
        System.out.println("\nTich hai ma tran la D :");
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                System.out.printf("\t%d\t",D[i][j]);
            }
            System.out.println("");
        }
    }
    
}
