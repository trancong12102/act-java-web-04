/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_10;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        String n = input.nextLine();
        
        for(int i = 0; i <= (n.length()/2); i++){
            if (n.charAt(i) != n.charAt(n.length() - 1 - i)){
                System.out.println(n + " khong phai la so doi xung ");
                break;
            } else {
                System.out.println(n + " la so doi xung ");
                break;
            }
        }
    }
    
}
