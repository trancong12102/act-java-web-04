package trieubai4a;
import java.util.Scanner;
public class TrieuBai4a {

    /**
     * nhap so nguyen a bat ki tu ban phim den khi nhap 0 thi dung lai 
      va in ra so lon nhat vua nhap*/
    public static void main(String[] args) {
        System.out.println("----Bai 4a----");
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
            if(b>a){
                a=b;            
            }
        }
        System.out.printf("So lon nhat trong day so vua nhap la: %d",a);
    }
    
}
