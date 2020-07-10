/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        float s=0;
        int s1=0;
        int s2=0;
        float s3=0;
        float s4=0;
        float s5=0;
        float s6=0;
        int s7=1;
        int sum=0;
        int s8=0;
        int s9=0;
        int s10=0;
        float s11=0;
        int z=0;
        System.out.println("So phan tu n:");
        int n = input.nextInt();
        System.out.println("Nhap x:");
        int x= input.nextInt();
        for(int i = 1 ; i<=n;i++)
        {   
            z+=i;
            s+=(1.0/i);
            s1+=i;
            s2+=(i)*(i);
            s3+= (1.0/(2*i));
            s4+=(1.0/((2*i)+1));
            s5+=(1.0/(i*(i+1)));
            s6+=((2*i)+(1.0))/((2*i)+2);
            s7*=i;
            sum+=s7;
            s8+=Math.pow(x,i);
            s9+=Math.pow(x,(i*2));
            s10+=Math.pow(x,(2*i+1));
            s11+=(1.0)/z;
        }
        System.out.println("Tong day so :S= 1+...1/n:"+s);
        System.out.println("Tong day so :S=1+2+3+...+n:"+s1);
        System.out.println("Tong day so :S=1^2+2^2+3^2+...+n^2:"+s2);
        System.out.println("Tong day so :S=1/2+1/4+1/6...1/2n:"+s3);
        System.out.println("Tong day so :S=1/3+1/5+1/7+...1/(2n+1):"+s4);
        System.out.println("Tong day so :S=1/(1*2)+1/(1*3)+...+1/(1*n):"+s5);
        System.out.println("Tong day so :S=1/2+3/4+...+(2n+1)/(2n+2):"+s6);
        System.out.println("Tong day so :S=1+1.2+...+1.2.3...n:"+sum);
        System.out.println("Tong day so :S=x+x^2+x^3+...+x^n:"+s8);
        System.out.println("Tong day so :S=x^2+x^4+...+x^2n:"+s9);
        System.out.println("Tong day so :S=x+x^3+x^5+...+x^(2n+1):"+s10);
        System.out.println("Tong day so :S=1+1/(1+2)+...+1/(1+2+...+n):"+s11);
    }
    
}
