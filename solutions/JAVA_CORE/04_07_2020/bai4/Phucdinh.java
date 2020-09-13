/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n= input.nextInt();
        
        while(n!=0)
        {   int max;
            max= input.nextInt();
            if(max==0)
            {
                break;
                       
            }else if (max>n){
                n =max;
            }
        }System.out.println("số lớn nhất vừa nhập là:" +n);
    }
    
}
    