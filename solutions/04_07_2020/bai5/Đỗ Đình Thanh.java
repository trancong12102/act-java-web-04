
package demo;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args)
    {
        Scanner nhap = new Scanner(System.in);
         System.out.println("Bai 5");
         System.out.print("Nhap N: ");
         int n= nhap.nextInt();
         float S=0;
        
        while (n>0)
        {
            S+= (float)1/n;       // S= 1+ 1/2 +...+ 1/n
            //S+= n;              // S= 1 + 2 + ... + n;
            //S+= (n*n);          // S= 1^2 +2^2+ ... + n^2
            //if(n!= 0)  S+= (float)1/(2*n);   // S= 1/2 +1/4+ ....+ 1/2n
        
            //S+= (float)1/(n*(n+1))   // S= 1/(1*2) + 1/(2*3) + ... +1/(n*(n+1))
            
            /*int a=1;
            for(int i=1;i<=n;i++)
            { 
                a*=i;
            }
              S+=a;                    // S= 1+ 1*2+ 1*2*3 +...+ 1*2*..*n
            */
            
            n--;
        }
        
        /*
        while (n>=0)
        {
            //S+= (float)1/(2*n+1);          // S= 1+ 1/3 +... 1/(2n+1)
            //S+= (float)(2*n+1)/(2*n+2);     // s= 1/2 +3/4 +...+ (2n+1)/(2n+2)
            n--;
        }*/
         
         //System.out.print("Nhap X: ");
         //int x= nhap.nextInt();
        /*
        while(n>0)
        {
            //S+= Math.pow(x,n);        // S= x + x^2+... x^n
            //S+= Math.pow(x,2*n);      // S= x^2 +x^4 +...+ x^2n;
            int b= 0;
            for(int j=1;j<=n;j++)
            {
                b+= j;
            }
            S+= (float)1/b;            //S= 1 + 1/(1+2) +...+ 1/(1+2+3..+n)
            n--;
        }*/
        
        /*
        while(n>=0)
        {
           S+= Math.pow(x,2*n+1);     // S= x + x^3 + x^5+ ... + x^(2*n+1)
           n--;
        }*/
        
        
        System.out.println("S = "+ S);
        
    }
}
