/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paliprome;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Paliprome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        string=scanner.nextLine();
        String reverse= new StringBuffer(string).reverse().toString();
        if (string.equals(reverse)) 
        {
            System.out.println("La parolime");
            
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
