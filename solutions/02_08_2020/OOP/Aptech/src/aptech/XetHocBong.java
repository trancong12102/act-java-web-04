/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XetHocBong {
    private String name;
    private String KhoaHoc;
    private double DTongK;
    private String NoiQuy;
    private int SoLanThi;
    
    public XetHocBong() {
    }

    public XetHocBong(String name, String KhoaHoc, double DTongK, String NoiQuy, int SoLanThi) {
        this.name = name;
        this.KhoaHoc = KhoaHoc;
        this.DTongK = DTongK;
        this.NoiQuy = NoiQuy;
        this.SoLanThi = SoLanThi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(String KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    public double getDTongK() {
        return DTongK;
    }

    public void setDTongK(double DTongK) {
        this.DTongK = DTongK;
    }

    public String getNoiQuy() {
        return NoiQuy;
    }

    public void setNoiQuy(String NoiQuy) {
        this.NoiQuy = NoiQuy;
    }

    public int getSoLanThi() {
        return SoLanThi;
    }

    public void setSoLanThi(int SoLanThi) {
        this.SoLanThi = SoLanThi;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        do {            
            System.out.println("Co dang ky khoa hoc HDSE khong: ");
            KhoaHoc = sc.nextLine();
            if(KhoaHoc.equalsIgnoreCase("co") || KhoaHoc.equals("khong")){
                break;
            }
            else{
                System.out.println("Ban chi duoc nhan co hoac khong. Moi nhap lai.");                
            }
                
        } while (true);
        
        do {            
            System.out.println("Diem tong ket: ");            
            DTongK = Double.parseDouble(sc.nextLine());
            if(DTongK < 0 || DTongK > 10){
                System.out.println("Ban nhap sai, moi nhap lai");
            }
            else
                break;                
        } while (true);
        
        do {            
            System.out.println("Co vi pham noi quy khong: ");
            NoiQuy = sc.nextLine();
            if(NoiQuy.equalsIgnoreCase("co") || NoiQuy.equals("khong")){
                break;
            }
            else{
                System.out.println("Ban chi duoc nhan co hoac khong. Moi nhap lai.");                
            }
                
        } while (true);
        
        System.out.println("Nhap so lan thi: ");
        SoLanThi = Integer.parseInt(sc.nextLine());
    }
    
    public void xetHB(){
        if(this.getKhoaHoc().equalsIgnoreCase("co") && this.getDTongK() >= 7.5
                && this.getNoiQuy().equalsIgnoreCase("khong") && this.SoLanThi == 1){
            System.out.println(getName() + " Du dieu kien dat hoc bong");
        }
        else{
            System.out.println(getName() + " Khong du dieu kien hoc bong");
        }
    }

    public void outputInfo(){
        System.out.println(getName() + "\t" +getKhoaHoc() + "\t" +getDTongK() +"\t" +getNoiQuy() +"\t" +getSoLanThi());
    }

    
    
    
}
