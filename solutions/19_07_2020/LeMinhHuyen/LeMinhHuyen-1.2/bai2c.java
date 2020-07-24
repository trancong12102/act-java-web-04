
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
public class bai2c {
    public static void main(String[] args) {
        int[] Array = new int[5]; //khai bao mang
        //nhap vao mang 
        Scanner input = new Scanner(System.in); 
        for(int i=0; i<Array.length; i++){
            System.out.println("Nhap vao cac phan tu cua mang"); 
            Array[i] = Integer.parseInt(input.nextLine().trim()); 
            
        }
        System.out.println("Cac so chia het cho 3 la:");
        for (int i=0; i<Array.length; i++){
            if (Array[i]%3==0){
                
                System.out.println(Array[i]);
            }
        }
    }
    
}
