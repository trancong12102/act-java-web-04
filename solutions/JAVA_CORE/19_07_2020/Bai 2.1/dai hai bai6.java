/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt19_7;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] =new int[3][3];
        System.out.println("Nhập ma trận 3*3:");
        int n;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                n=input.nextInt();
                A[i][j]=n;               
            }
        }
        // in ra ma trận 3*3
        System.out.println("Ma trận A:  ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
        //Tính tổng các hàng
        int dem;
        for(int i=0;i<3;i++){
            int Hang=0;
            for (int j=0;j<3;j++){
                Hang=Hang+A[i][j];
            }
            dem=i+1;
            System.out.print("Hang ");
            System.out.println(dem+" có tổng là: "+Hang);
        }
        //Tính tổng các cột
        for(int j=0;j<3;j++){
            int Cot=0;
            for (int i=0;i<3;i++){
                Cot=Cot+A[i][j];
            }
            dem=j+1;
            System.out.print("Cot ");
            System.out.println(dem+" có tổng là: "+Cot);
        }
    }
}
