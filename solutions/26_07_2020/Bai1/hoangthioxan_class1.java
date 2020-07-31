/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Nhanvien {

    // khai bao cac thuoc tinh cua Nhanvien
    private String name;
    private int age;
    private String address;
    private long luong;
    private int sogiolam;

    // Ham tao k tham so
    Nhanvien() {
        name = "Soan";
        age = 20;
        address = " Hai duong";
        luong = 1;
        sogiolam = 30;

    }

    // Ham tao day du tham so
    Nhanvien(String name, int age, String address, long luong, int sogiolam) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.luong = luong;
        this.sogiolam = sogiolam;

    }

    // cac ham get/set
    String getName() {
        return name;
    }

    void setName( String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age){
        this.age = age;
    }
    String getAdrress(){
        return address;
    }
    void setAdress(String address){
        this.address= address;
    }
    long getLuong(){
        return luong;
        
    }
    void setLuong(long luong){
        this.luong=luong;
    }
    int getSogiolam(int sogiolam){
        return sogiolam;
    }
    void setSOgiolam(int sogiolam){
        this.sogiolam=sogiolam;
    }
    
    
 //phuong thuc void inputInfo()
    void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten:");
        name= sc.nextLine();
        System.out.println("Nhap tuoi:");
        age= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi :");
        address= sc.nextLine();
        System.out.println("Tien luong:");
        luong =sc.nextLong();
        sc.nextLine();
        System.out.println("Tong so gio lam viec la:");
        sogiolam= sc.nextInt();
        
        
    }
    // phuong thuc printInfo()
       void printInfo(){
         System.out.println("--------Thong tin nhan vien -------");
         System.out.println("Ten:"+ this.name);
         System.out.println("Tuoi:"+ this.age);
         System.out.println("Dia chi:"+ this.address);
         System.out.println("Tien luong:"+ this.luong);
         System.out.println("Tong so gio lam viec:"+ this.sogiolam);
         System.out.println("thuong:"+this.tienthuong());
         System.out.println("Tong luong la:"+ (this.tienthuong()+this.luong));
       }
        
       
      // tinh thuong
       long tienthuong(){
           long thuong;
           if(sogiolam >= 200){
               thuong= (long) (luong*0.2);
           }else if(sogiolam >= 100){
               thuong= (long) (luong*0.1);
           } else{
               thuong =0; 
           }
           return thuong;
       }
    
    

   
    
    
    
           




}
