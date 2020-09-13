
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DaiPhongPC
 */
public class bai2b {
    public static void main(String[] args) {
        int[] Array = new int[5]; //khai bao mang
        //nhap vao mang 
        Scanner input = new Scanner(System.in); 
        for(int i=0; i<Array.length; i++){
            System.out.println("Nhap vao cac phan tu cua mang"); 
            Array[i] = Integer.parseInt(input.nextLine().trim()); 
        }
        //tim phan tu nho nhat trong mang 
        int minimum =Array[0]; 
        for(int i=0; i<Array.length; i++){
            if(minimum > Array[i]){
                minimum = Array[i]; 
            }
        }
        System.out.println("Gia tri nho nhat la "+ minimum);
    }
    
}
