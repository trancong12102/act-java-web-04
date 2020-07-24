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
public class BT19_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int A[] = new int[5];
        System.out.print("Nhập các giá trị của Mảng: ");
        int S=0;
        int le=0;
        int chan=0;
        
        for (int i=0;i<A.length;i++){
            A[i] = input.nextInt();
            System.out.print(", ");
            S=S+A[i];
            if(A[i]%2==0){
                chan=chan+A[i];
            }
            else{
                le=le + A[i];
            }
        }
        System.out.println("Tong cua mang la: "+S);
        System.out.println("Tong cua các phan tu chan la: "+chan);
        System.out.println("Tong cua các phần tử lẻ: "+le);
    }
    
}
