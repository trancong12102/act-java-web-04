/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Student {

    Scanner sc = new Scanner(System.in);
    private String code;
    private double dtb;
    private int tuoi;
    private String lop;

    public Student(String code, double dtb, int tuoi, String lop) {
        this.code = code;
        this.dtb = dtb;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
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

    public void inputInfo() {
        System.out.println("Nhap ma sinh vien:");
        setCode(sc.nextLine());
        while (getCode().length() != 8) {
            System.out.println("Nhap du 8 ki tu");
            setCode(sc.nextLine());
        }
        System.out.println("Nhap diem trung binh:");
        setDtb(Double.parseDouble(sc.nextLine()));
        while (getDtb() < 0 || getDtb() > 10) {
            System.out.println("Diem trung binh trong khoang 0-10:");
            setDtb(Double.parseDouble(sc.nextLine()));
        }
        System.out.println("Nhap tuoi sinh vien:");
        setTuoi(Integer.parseInt(sc.nextLine()));
        while (getTuoi() < 18) {
            System.out.println("tuoi sinh vien >18 :");
            setTuoi(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Nhap lop sinh vien:");
        setLop(sc.nextLine());
//        char kiTuDau = st.getLop().charAt(0);
        while (!getLop().startsWith("A") && !getLop().startsWith("C")) {
            System.out.println("Lop phai bat dau bang tu khoa 'A' hoac 'C':");
            setLop(sc.nextLine());
        }

    }

    public void testHocBong() {
        if (getDtb() >= 8) {
            System.out.println("Sinh vien duoc hoc bong");
        } else {
            System.out.println("Sinh vien khong duoc hoc bong");
        }
    }

    public void printInfo() {
        System.out.println("Ma SV: " + getCode());
        System.out.println("Diem trung binh SV: " + getDtb());
        System.out.println("Tuoi SV: " + getTuoi());
        System.out.println("Lop SV: " + getLop());
    }
}
