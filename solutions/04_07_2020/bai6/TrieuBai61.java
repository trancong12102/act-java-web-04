package trieubai61;

import java.util.Scanner;


public class TrieuBai61 {

    /**
     * tim UCLN cua 2 so a va b
     */
    public static void main(String[] args) {
       System.out.println("Xin moi nhap a:");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Xin moi nhap b:");
        int b= input.nextInt();
        for(int i=a*b;i<=a*b;i--){
            if(a%i==0 && b%i==0){
                System.out.printf("UCLN = %d\n",i);
                break;}
            }
        for(int j=1; j<=a*b;j++){
            if(j%a==0&& j%b==0){
                System.out.printf("BCNN = %d\n",j);
            break;
            }
        }
        
        }
    }
    

