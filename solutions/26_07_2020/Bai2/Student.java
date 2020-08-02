package bai2;
import java.util.Scanner;
/**
 *
 * @author Trieu
 */
public class Student {
    private String tenSV;
    private String MSV;
    private float DTB;
    private int tuoi;
    private String lop;
    private String hocBong;
    //Contructor khong tham so
    public Student() {

    }
    //Contructor co tham so

    public Student(String tenSV,String MSV, float DTB, int tuoi, String lop) {
        this.tenSV=tenSV;
        this.MSV = MSV;
        this.DTB = DTB;
        this.tuoi = tuoi;
        this.lop = lop;
        this.hocBong= hocBong;
    }
    
    //ham set get
    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
     public String getHocBong() {
        return hocBong;
    }

    public void setHocBong(String hocBong) {
        this.hocBong = hocBong;
    }
     //ham nhap
    void inputInfor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        tenSV = input.nextLine();
        do {
            System.out.println("Nhập mã sinh viên :");
            MSV = input.nextLine();
        } while (MSV.length() != 8);
        do {
            System.out.println("Điểm trung bình :");
            DTB = Float.parseFloat(input.nextLine());
        } while (DTB < 0 && DTB > 10);
        do {
            System.out.println("Tuổi:");
            tuoi = Integer.parseInt(input.nextLine());
        } while (tuoi < 18);
        do {
            System.out.println("Lớp:");
            lop = input.nextLine();
        } while (lop.charAt(0)!='A'&&lop.charAt(0)!='C');
   
    }
    
    //ham kiem tra
     String kiemtra()
    {
        if(DTB>8.0)
        {
            return hocBong = "Co duoc hoc bong";
        }
        else
        {
            return hocBong="Không duoc hoc bong";
        }
    }
     
     //ham xuat
     void ouputShow() {
        System.out.println("Tên học sinh :" + tenSV);
        System.out.println("Mã SV :" + MSV);
        System.out.println("Điểm trung bình :" + DTB);
        System.out.println("Tuổi :" + tuoi);
        System.out.println("Lớp :" + lop);
        System.out.println("Học bổng:"+kiemtra());
    }
}
