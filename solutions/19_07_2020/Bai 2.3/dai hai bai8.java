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
public class bt8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] =new int[3][3];
        System.out.println("Nhập ma trận A 3*3:");
        int n;
        //Nhập ma trận A
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                n=input.nextInt();
                A[i][j]=n;    
                System.out.print("A"+i +j);
                System.out.println("="+n);
            }
        }
        //in ma tran
        System.out.println("Ma trận A:  ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        //kiểm tra ma trận đơn vị
        int dem=0,dem1=0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(i==j){
                    if(A[i][j]==1){
                        dem++;
                    }
                }
                else{
                    if(A[i][j]==0){
                        dem1++;
                    }
                }
            }
        }
        if(dem==3 && dem1==6){
            System.out.println("Ma trận A là ma trận đơn vị ");
        }
        else{
            System.out.println("Ma trận A k phải ma tran đơn vị");
        }
        //ma trận 0
        dem=0;
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++){
                if(A[i][j]==0){
                    dem ++;
                }                
        }            
        }
        if (dem==9){
            System.out.println("Ma tran A la ma tran 0");
        }
        else{
            System.out.println("Ma tran A khong phai ma tran 0");
        }
        dem=0;
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++){
                if(A[i][j]==A[j][i]){
                    dem ++;       }                
        }            
        }
        if (dem==9){
            System.out.println("Ma tran A la ma tran doi xung");
        }
        else{
            System.out.println("Ma tran A khong phai ma tran đối xứng");
        }
    }
}
