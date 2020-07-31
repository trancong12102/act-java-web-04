/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass;

/**
 *
 * @author Dell
 */
  public class Student {

    private String ten;
    private int tuoi;
    private String masv;
    private double diemtb;
    private String lop;
    Student(){
        
    }

    public Student(String ten, int tuoi, String masv, double diemtb, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.masv = masv;
        this.diemtb = diemtb;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getMasv() {
        return masv;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public String getLop() {
        return lop;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}