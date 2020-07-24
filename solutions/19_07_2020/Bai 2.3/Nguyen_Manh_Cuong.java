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
public class ex3 {
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        Scanner sc= new Scanner(System.in);
        int i,j;
        int count1=0;
        int count2=0;
        int count3=0;
        System.out.println("Nhap ma tran ma ban muon kiem tra");
        for (i = 0;i<3;i++) {
            for(j=0;j<3;j++){
                System.out.printf("A[%d][%d]= ",i+1,j+1);
                arr[i][j]=sc.nextInt();
                //tao 1 ham de xem co bao nhieu phan tu trong ma tran bang khong
                if(arr[i][j]==0){
                    count2++;
                }
            }
            
        }
        for(i=0;i<3;i++){
            if(arr[i][i]==1){
                count1++;
            }   
        }
        //kiem tra xem trong so co bang n khong ơ day n=3
        //(voi n la cot hc hang vi ma tran don vi chi xh tren ma tran vuong ma ma tran vuong cot=hang) 
        if(count1==3){
            System.out.println("Day la ma tran don vi");
        }
        //ma tran 0 là toan bo phan tu bang khong tuc la co 3*3=9 phan tu= 0
        if(count2==9){
            System.out.println("Day la ma tran 0");
        }
        //dung vong for de xem xem 2 phan tu doi nhau co bang nhau khong, neu khong bang thi bien count tang 1
        for (i = 0;i  < 3;i ++) {
            for (j = 0;j  < 3;j ++) {
                if(arr[i][j]!=arr[j][i]){
                   count3++; 
                }              
            }
        }
        //neu bien count = 0 tuc day la ma tran doi xung
        if(count3==0){
            System.out.println("Day la ma tran doi xung");
        }
    }
}
