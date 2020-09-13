/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Scanner;
public class Bai4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=0;
        int min=1000000000;
      Scanner input= new Scanner(System.in);
        System.out.println("Moi ban nhap day so");
      int n=0;
      do
      {
            int a = input.nextInt();
            int c=0;
            c=a;
            int b=a;
              if(c>max)
              {
                  max=c;
              }
              if(b<min&&b!=0)
              {
                  min=b;
              }
              if(c==0)
              {
                  break;
              }
      }while(n<100000);
      System.out.println("So lon nhat trong day so la "+max);
      System.out.println("So nho nhat trong day so la "+min);
    }
    
}
