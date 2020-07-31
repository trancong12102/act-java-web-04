
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class AP {
    private float diem;
    private String tenKH;
    private String Vipham;
    private int lanthi;

    public float getDiem() {
        return diem;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getVipham() {
        return Vipham;
    }

    public int getLanthi() {
        return lanthi;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setVipham(String Vipham) {
        this.Vipham = Vipham;
    }

    public void setLanthi(int lanthi) {
        this.lanthi = lanthi;
    }

    public AP() {
    }

    public AP(float diem, String tenKH, String Vipham, int lanthi) {
        this.diem = diem;
        this.tenKH = tenKH;
        this.Vipham = Vipham;
        this.lanthi = lanthi;
    }
    public void INPUT()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Ten khoa hoc dang ki==>");
        this.tenKH=sc.nextLine();
        System.out.print("Diem ==>");
        this.diem=sc.nextFloat();
        sc.nextLine();
        System.out.print("HV co vi pham khong?<co/khong> ");
        this.Vipham=sc.nextLine();
        System.out.println("Lan thi==>");
        this.lanthi=sc.nextInt();
        sc.nextLine();
    }
    public void kiemtraHB()
    {
        double d=this.diem*75/100;
        if(this.tenKH.equals("HDSB")&&this.diem>d&&this.Vipham.equals("khong")&&this.lanthi==1)
        {
            System.out.println("Co hoc bong");
        }
        else
        {
            System.out.println("khong co hoc bong");
        }
    }
    
}
