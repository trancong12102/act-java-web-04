/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg2mangthuchanh;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai12mangthuchanh {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int A[][] =new int[3][3];
        System.out.println("Nhập ma trận 2 chieu 3*3:");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();            
            }
        }
        // In ra ma trận A
        System.out.println("Ma trận A:  ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
        //Tính tổng các hàng của ma trận
        int dem;
        for(int i=0;i<3;i++){
            int Row=0;
            for (int j=0;j<3;j++){
                Row+=A[i][j];
            }
            System.out.printf("Tong cua hang %d: %d\n",i+1,Row);
        }
        //Tính tổng các cột của ma trận
        for(int j=0;j<3;j++){
            int Col=0;
            for (int i=0;i<3;i++){
                Col+=A[i][j];
            }
            System.out.println("Tổng các số hạng của cột thứ 1 +"+ j  +" là: "+Col);
        }
    }
        // TODO code application logic here
    }
    

