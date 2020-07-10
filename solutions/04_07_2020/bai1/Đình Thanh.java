package demo;
import java.util.Scanner;
public class Demo {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 1 : ax^2 + bx +c =0");
        System.out. print("Nhap a: ");
        int a= input.nextInt();
        
        System.out. print("Nhap b: ");
        int b = input.nextInt();
        //int b= Integer.parseInt(input.nextLine());
        
        System.out.print("Nhap c: ");
        int c = input.nextInt();        
        //int c= Integer.parseInt(input.nextLine());
        
        float delta= (float)b*b-4*a*c;
        //System.out.printf("a =%d, b=%d, c=%d, delta =%f \n",a, b,c,delta);
         if(delta <0 )
         {
              System.out.println(" Phuong trinh vo nghiem ");
         } 
         else if ( delta ==0)
         {
             System.out.println(" Phuong trinh co nghiem kep x = "+ (float)-b/(2*a));
         }
         else
         {
             System.out.println(" Phuong trinh co 2 nghiem ");
             System.out.println("x1 = "+(float)(-b+Math.sqrt(delta))/(2*a));
             System.out.println("x1 = "+(float)(-b-Math.sqrt(delta))/(2*a));
         }
         
         
         
         }
   }
    

