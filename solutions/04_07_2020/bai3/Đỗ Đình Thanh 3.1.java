
package demo;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
      
        Scanner abc1 = new Scanner(System.in);
        System.out.println("Bai 3: kiem tra so nguyen to");
        System.out.print("Nhap N: ");
        int n= abc1.nextInt();
        
        if(n==1)
            System.out.println(" So 1 ko la so nguyen to");
        else if(n<4)
            System.out.println(n +" la so nguyen to ");
        
        int canN= (int)Math.sqrt(n);
        while(canN>1&&n>=4){
          if(n%canN==0){
             System.out.println(n+ " khong la so nguyen to");
             break;
            }
          if(canN==2){
              System.out.println(n+" la so ngueyn to ");
            }
           canN--;
        }
        
        
        }
          
    }

