/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg2mangthuchanh;
import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai22mangthuchanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int A[][] =new int[3][3];
        System.out.println("Nhập ma trận A 3*3:");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();            
            }
        }
        int B[][] =new int[3][3];
        System.out.println("Nhập ma trận B 3*3:");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 System.out.printf("B[%d][%d] = ",i,j);
                B[i][j] = input.nextInt();            
            }
        }
        //Tổng của 2 Ma trận 
   System.out.println("> Tong cua hai ma tran la: ");
   int C[][] =new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.printf("%d\t",C[i][j]);
            }
            System.out.print(" ");
        }
        // Tich cua 2 ma tran
        System.out.println("Tich cua hai ma tran la: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A.length; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.printf("%d\t",C[i][j]);
            }
            System.out.print(" ");
        }       
    }
        
        
        // TODO code application logic here
    }
    

