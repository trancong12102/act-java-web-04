package bai3;
import java.util.Scanner;

public class HocBong {
    private String dk;
    private float diemTK;
    private int viPham ;
    private int lanThi;
    Scanner input = new Scanner(System.in);
    
    //Contructor khong tham so
    public HocBong(){
    
    }
    public HocBong(String dk,float diemTK,int viPham,int lanThi){
        this.dk= dk;
        this.diemTK= diemTK;
        this.viPham= viPham;
        this.lanThi = lanThi;
    }
    
    
// ham set get
    
    public String isDk() {
        return dk;
    }

    public void setDk(String dk) {
        this.dk = dk;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    public int getViPham() {
        return viPham;
    }

    public void setViPham(int viPham) {
        this.viPham = viPham;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
  //nhap du lieu 
   void inputInfor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sinh vien co dang ki khoa HDSE (yes/ no) :");
        dk = input.nextLine();
        System.out.print("Diem tong ket cua sinh vien la:");
        diemTK = input.nextFloat();
        input.nextLine();
        System.out.print("So lan vi pham noi quy:");
        viPham = input.nextInt();
        System.out.print("So lan thi la:");
        lanThi = input.nextInt();

    }
   //xuat du lieu
   void kiemTra(){
       if(this.dk.equals("yes")&&this.diemTK>=7.5&&this.viPham==0&&this.lanThi==1){
           System.out.println("Hoc vien co duoc hoc bong");
       }else{
           System.out.println("Hoc vien khong duoc hoc bong");
       }
   }
   
}
