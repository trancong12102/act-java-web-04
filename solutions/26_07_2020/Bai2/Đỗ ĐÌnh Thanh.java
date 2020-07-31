package Bai2;
import java.util.Scanner;
public class Student {
    private String maSv;
    private float diemTB;
    private int tuoi;
    private String lop;

    public Student() {
        maSv = "1";
        diemTB = 0;
        tuoi = 18;
        lop = "A";
    }
    
    public Student(String maSv, float diemTB, int tuoi, String lop) {
        this.maSv = maSv;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSv() {
        return maSv;
    }
    public float getDiemTB() {
        return diemTB;
    }
    public int getTuoi() {
        return tuoi;
    }
    public String getLop() {
        return lop;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    public void setDiemTB(float diemTB){
        this.diemTB = diemTB;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    void inputInfo(){
        Scanner nhap = new Scanner(System.in);
        do{
        System.out.print("Nhap maSV: ");
        this.maSv = nhap.nextLine();
        }while(this.maSv.length() !=8);
        do{
         System.out.print("Nhap DiemTB: ");
        this.diemTB = Float.parseFloat(nhap.nextLine());
        }while(this.diemTB <0.0 && this.diemTB > 10.0);
        do {
        System.out.print("Nhap Tuoi: ");
        this.tuoi = Integer.parseInt(nhap.nextLine());
        }while(this.tuoi < 18);
        do{ 
        System.out.print("Nhap Lop: ");
        this.lop = nhap.nextLine();
        }while(this.lop.charAt(0)!='C' && this.lop.charAt(0)!= 'A');
    }
    
    void showInfo(){
        System.out.printf("\nTHông tin Student:\n");
        System.out.println("maSV:    " + maSv);
        System.out.println("DiemTB:  " + diemTB);
        System.out.println("Tuoi:    " + tuoi);
        System.out.println("Lop:     " + lop);
        System.out.println("HocBong: "+ hocBong(diemTB));
    }
    
    String hocBong(float diem){
        if (diem>=8){
            return "duoc hoc bong!";
        } else {
            return "ko dc";
        }
    }
    
    
    public static void main(String[] args){
         Student a = new  Student();
        a.inputInfo();
        a.showInfo();
       
    }
}
