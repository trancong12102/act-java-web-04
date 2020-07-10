/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n;int max=0,min;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        min=n;
        do { 
           
                max=max>n?max:n;
                min=min<n?min:n;
                System.out.println("Nhap n<>0 de tiep tuc,==0 de dung lai");
                n=sc.nextInt();
           
            
        } while (n!=0);
        System.out.println("Max:"+max+", "+"Min:"+min);
        
    }
    
}
