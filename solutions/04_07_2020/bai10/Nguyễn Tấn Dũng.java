/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int r,sum=0,temp;
        System.out.println("Nhap So N Can Kiem Tra Doi Xung");
        int num=input.nextInt();        
        for(temp=num;num!=0;num=num/10)
        {
         r=num%10;
         sum=sum*10+r;
        }
        if(temp==sum)
        {
            System.out.printf("%d la so doi xung",temp);
        }
        else
        {
            System.out.printf("%d khong phai la so doi xung",temp);
        }
    }

