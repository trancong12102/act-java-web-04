package mangbai5;

import java.util.Scanner;
public class MangBai5 {

   
    public static void main(String[] args) {
        int[] A= new int[3];
        int[] B= new int[3];
        Scanner input = new Scanner(System.in);
        
        //nhap 2 vector A va B
        System.out.println("Nhap vector A :");
        for (int i = 0; i < A.length; i++) {
            A[i]= input.nextInt();
        }
        System.out.println("Nhap vector B :");
        for (int i = 0; i < B.length; i++) {
            B[i]= input.nextInt();
        }
        
        //xuat 2 vector vua nhap
        System.out.printf("Vector A vua nhap la :");
        {
            for (int i = 0; i < A.length; i++){
                 System.out.printf("\t%d\t",A[i]);
            }
        }
        
         System.out.printf("\nVector B vua nhap la :");
        {
            for (int i = 0; i < B.length; i++){
                 System.out.printf("\t%d\t",B[i]);
            }
        }
        //tong 2 vector
        int[] C = new int[3];
        for (int i = 0; i < C.length;i++) {
            C[i]= A[i] + B[i];
        }
         System.out.printf("\nTong 2 vector la C :");
        {
            for (int i = 0; i < C.length; i++){
                 System.out.printf("\t%d\t",C[i]);
            }
        }
        
        //tich 2 vector
        int[] D = new int[3];
        for (int i = 0; i < C.length;i++) {
            D[i]+= A[i]*B[i];
        }
         System.out.printf("\nTich 2 vector la D :");
        {
            for (int i = 0; i < D.length; i++){
                 System.out.printf("\t%d\t",D[i]);
            }
        }
    }
    
} 