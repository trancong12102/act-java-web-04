/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4a;
import java.util.Scanner;
/**
 *Created by Huong Lan on 10/07/2020
 * 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        System.out.println("Nhap day so:");
          int n = input.nextInt();
          int max=n;
          while(n!=0){
              n = input.nextInt();
              if(n>max) max=n;
          }
            System.out.println("So lon nhat vua nhap la: "+max);
    }
    
}
