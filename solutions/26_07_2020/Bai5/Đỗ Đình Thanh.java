package Bai5;
import java.util.Scanner;
public class TamGiac {

      public int a,b,c;
     
      public TamGiac() {
      }
    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
      
      void nhap(){
          Scanner nhap= new Scanner(System.in);
          System.out.println("Nhap 3 canh tam giac: ");
          this.a = nhap.nextInt();
          this.b = nhap.nextInt();
          this.c = nhap.nextInt();
      }
        String KieuTamGiac(){
            if(a==b && b==c )
              return " đều ";
            else if( b==a&&(c*c)==(a*2*a) || b==c&&(a*a)==(b*2*b) || c==a&&(b*b)==(a*2*a) )       
              return "Vuông cân"; 
            else if(a==b||b==c||c==a)
               return " cân ";
            else if( (a*a +b*b) == c*c || (a*a+c*c)== b*b || (b*b+c*c)==a*a )
              return " vuông ";
            else
              return "binh Thuong";
      }
      int ChuVi(){
          return a+b+c;
      }
      float DienTich(){
          float p= (float)(a+b+c)/2;
          return (float) Math.sqrt((p-a)*(p-b)*(p-c)*p);
      }
      
     public static void main(String[] args){
         TamGiac x = new TamGiac();
         x.nhap();
         System.out.println("Tam Giác trên là Tam giác"+ x.KieuTamGiac());
         System.out.println("Chu vi = "+ x.ChuVi());
         System.out.println("Dien Tich = "+ x.DienTich());
     }
}
