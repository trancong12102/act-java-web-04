package Bai4;
import java.util.Scanner;
public class SoNguyenTo {
    
    private int a;
    public SoNguyenTo() {
    }
    
    public SoNguyenTo(int x) {
        if(isSoNguyenTo(x) == true){
             this.a = x;            
        }
        else
            System.out.printf("%d không là số nguyên tố\n", x);
    }
    
    boolean isSoNguyenTo(int x){
        for (int i = 2; i < x; i++) {
            if(x%i == 0)
                break;
            if(i==x-1)
                return true;
        }
        return false;
    }
    
    int timSoNguyenToTiepTheo(int a){
        int b=a+1;
        while(isSoNguyenTo(b)!=true){
            b++;;
        }
        return b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        if(isSoNguyenTo(a)==true){
             this.a= a;
             System.out.printf("đã set this.a = %d\n", a);
        }
        else 
            System.out.printf("\nko set vì %d ko là số nguyên tố\n", a);
    }
     
    public static void main(String[] args){
        SoNguyenTo x= new SoNguyenTo();
        x.setA(10);
        System.out.println("khi đó getA = " + x.getA());
        x.setA(7);
        System.out.println("getA = " + x.getA());
        System.out.println("So nguyen to tiep theo la: " + x.timSoNguyenToTiepTheo(x.getA()));
        
        SoNguyenTo b = new SoNguyenTo(9);
        System.out.println("So nguyen to b: "+ b.getA());
        
        
        SoNguyenTo c = new SoNguyenTo(5);
        System.out.println("So nguyen to c: "+ c.getA());
        
        
    }
    
    
    
    
}
