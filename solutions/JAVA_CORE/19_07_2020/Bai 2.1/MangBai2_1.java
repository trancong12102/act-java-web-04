package mangbai2_1;

import java.util.Scanner;
public class MangBai2_1 {

   
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        Scanner input= new Scanner(System.in);
        
        //Nhap ma tran A
        System.out.println("Nhap gia tri cac phan tu cua ma tran A");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("A[%d][%d] = ",i+1,j+1);
                A[i][j] = input.nextInt();
            }
        }
        
        //Xuat ma tran A
        System.out.println("Ma tran A vua nhap la:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("\t%d\t",A[i][j]);
            }
            System.out.println("");
        }
        
        //tong cac hang cua ma tran A
        int sum=0;
        for (int i = 0; i < A.length; i++) {
           for (int j = 0; j < A.length; j++) {
            sum+= A[i][j];
        } 
           System.out.printf("Tong cac phan tu hang %d la %d\n",i+1,sum);
        }
         
        //tong cac cot cua ma tran A
        
        for (int j = 0; j < A.length; j++) {
           for (int i = 0; i < A.length; i++) {
            sum+= A[i][j];
        } 
           System.out.printf("Tong cac phan tu cot %d la %d\n",j+1,sum);
        }
        
       
    
}
}
