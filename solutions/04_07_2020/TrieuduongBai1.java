package trieuduong.bai1;
/*pt: ax2+bx+c = 0
delta = b*b - 4*a*c
delta = 0 => x1=x2= -b/2a
delta < 0 => pt vo nghiem
delta > 0 => pt co 2 nghiem phan biet
x1 = (-b - candelta)/2a ; (-b + candelta)/2a
 */

import java.util.Scanner;
public class TrieuduongBai1 {
    public static void main(String[] args) {
        System.out.println("Pt bac 2 co dang: ax^2 + bx + c = 0");
        System.out.println("vui long nhap gia tri cua a, b, c :");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b*b-4*a*c;
        if(a==0){
            System.out.println("PT co nghiem x = "+(-c/b)); 
       
        }
        else{
            if(delta ==0){
                System.out.println("PT co ngiem kep x1=x2= "+(-b/2*a));
                }
            else if(delta>0){
                System.out.println("PT co 2 nghiem phan biet:");
                System.out.println("x1 = "+(-b-Math.sqrt(delta)/2*a));
                System.out.println("x2 = "+(-b+Math.sqrt(delta)/2*a));
                }
            else{
                System.out.println("PT vo nghiem");       }

            }
    }
    
}
