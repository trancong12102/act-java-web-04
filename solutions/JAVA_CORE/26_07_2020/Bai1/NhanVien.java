package bai1;

import java.util.Scanner;

/**
 *
 * @author Trieu
 */
public class NhanVien {

    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int gioLam;
    private double tienThuong;
    Scanner input = new Scanner(System.in);
// Constructor khong tham so

    public NhanVien() {

    }

    //Constructor co day du tham so
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int gioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.gioLam = gioLam;
    }

    //ham set, get
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public float getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    //
    void inputInfor() {
        System.out.println("Vui long nhap :");
        System.out.println("Ten nhan vien :");
        ten = input.nextLine();
        System.out.println("Tuoi :");
        tuoi = input.nextInt();
        input.nextLine();
        System.out.println("Dia chi :");
        diaChi = input.nextLine();
        System.out.println("Tien luong");
        tienLuong = input.nextDouble();
        System.out.println("So gio lam :");
        gioLam = input.nextInt();

    }

   double tinhThuong() {
        double thuong;
        if (gioLam >= 200) {
            return this.tienLuong*0.2;
        } else if (gioLam >= 100&&gioLam<200) {
            return this.tienLuong * 0.1;
        } else {
            return thuong = 0;
        }
       
    }

    void printfInfor() {
        System.out.println("-----Thong tin nhan vien-----");
        System.out.println("\n>Tên nhan vien: " + this.ten);
        System.out.println("\n>Tuoi :" + this.tuoi);
        System.out.println("\n>Dia chi :" + this.diaChi);
        System.out.println("\n>Tien luong :" + this.tienLuong);
        System.out.println("\n>Tong gio lam :" + this.gioLam);
        System.out.println(">Tien thuong :"+tinhThuong());
        System.out.println("\n>Tong tien Luong :" +( tinhThuong()+this.tienLuong));
    }
     public static void main(String[] args) {
        NhanVien nhanVien=new NhanVien();
        nhanVien.inputInfor();
        nhanVien.printfInfor();
}
    
}

