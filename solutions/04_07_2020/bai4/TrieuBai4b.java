package trieubai4b;

import java.util.Scanner;

public class TrieuBai4b {
/**
     * nhap so nguyen a bat ki tu ban phim den khi nhap 0 thi dung lai 
      va in ra so nho nhat vua nhap*/
    public static void main(String[] args) {
        System.out.println("----Bai 4b----");
        System.out.println("Vui long nhap:");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        if(a==0){
            System.out.println("vui long thuc hien lai :");
        }
        while(a!=0){  
            System.out.println("Vui long nhap:");
            int b= input.nextInt();
            if(b==0){
            break;   
            }
            if(b<a){
                a=b;            
            }
        }
        System.out.printf("So nho nhat trong day so vua nhap la: %d",a);
    }
    
}

