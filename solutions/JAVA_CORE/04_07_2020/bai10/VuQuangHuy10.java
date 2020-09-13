/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg10;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bài10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
{
    int n = 0, reverse = 0, rem, temp;
    System.out.println("Bai 10: kiem tra so doi xung");
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap vao so nguyen n: ");
    n = sc.nextLine();
   
   
    temp = n;
    while(temp != 0)
    {
        rem = temp % 10;
        reverse = reverse*10 + rem;
        temp /= 10;
    } 
    if(reverse == n) 
        System.out.println(" la so doi xung");
    else
        System.out.println(" khong doi xung");
    
}
        // TODO code application logic here
    }

    private static void printf(String d_khong_doi_xung) {
        
//To change body of generated methods, choose Tools | Templates.
    }
    
}
