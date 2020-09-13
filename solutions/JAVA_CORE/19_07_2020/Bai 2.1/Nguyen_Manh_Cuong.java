/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arr2;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class ex1 {
     public static void main(String[] args) {
         int [][] arr1 = new int [3][3];
         int [] sumR = new int [3];
         int i;
         int j;
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap ma tran dau tien");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             { 
                 System.out.printf("Nhap A[%d][%d]",i+1,j+1);
                 arr1[i][j]= sc.nextInt();
                 sumR[i]+=arr1[i][j];
             }
         }
         System.out.println("Tong tung hang la:");
         for(i=0;i<3;i++)
         {
             System.out.printf("Hang %d: %d\n",i+1,sumR[i]);
             sumR[i]=0;
         }
         System.out.println("Tong tung cot la:");
         for(j=0;j<3;j++){
             for(i=0;i<3;i++){
                 sumR[j]+=arr1[i][j];
             }
             System.out.printf("Cot %d: %d\n",j+1,sumR[j]);             
         }
         
         
     }
    
}
