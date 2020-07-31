package Bai3;
import java.util.Scanner;
public class hocVienAptech {
    private int Hdse;
    private int diem;
    private int noiQuy;
    private int thiLanDau;
    
    Scanner nhap = new Scanner(System.in);
    
    public int Hdse(){
        System.out.println("1. Là học viên đăng ký khóa hoc HDSE ko ?");
        System.out.printf("chọn 0: không \nchọn 1: có \nTrả lời: ");
        this.Hdse= nhap.nextInt();
        if(this.Hdse==1)
             return 1;
        else
             return 0;
    }
    
     public int DiemTB(){
        System.out.println("2. Điểm tổng kết bao nhiêu % ?\n Trả lời: ");
        this.diem= nhap.nextInt();
        if(this.diem>= 75)
             return 1;
        else
             return 0;
    }
     
     public int noi_quy(){
        System.out.println("3. Có vi phạm nội quy của trung tâm ko ?");
        System.out.printf("chọn 0: không \nchọn 1: có \ntrả lời: ");
        this.noiQuy= nhap.nextInt();
        if(this.noiQuy==1)
             return 1;
        else
             return 0;
    }
    public int thi_lan_dau(){
        System.out.println("4. Các kỳ thi chỉ thi lần đầu tiên ko ?");
        System.out.printf("chọn 0: không \nchọn 1: có \nTrả lời: ");
        this.thiLanDau= nhap.nextInt();
        if(this.thiLanDau==1)
             return 1;
        else
             return 0;
    }
    public String HocBong(){
        if( Hdse()==1 && DiemTB()== 1 && noi_quy()==0 && thi_lan_dau()==1 ){
            return "có";
        }else{
             return "không";
        }
    }
    
     public static void main(String[] args){
         hocVienAptech a= new hocVienAptech();        
         System.out.println("Sinh viên này " + a.HocBong() + " học bổng !!!" );
     }
}
