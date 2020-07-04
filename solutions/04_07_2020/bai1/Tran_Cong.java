/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HANH_ACT
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i<=n; i++){
            System.out.printf("Phần tử thứ %d là: ",i);
            arr[i] = input.nextInt();
            if(arr[i] == 9){
                System.out.print("Số 9 đầu tiên nằm ở vị trí thứ: "+i);
                break;
            }
        }
        
       
    }
    
}
