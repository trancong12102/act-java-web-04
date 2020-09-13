/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int workHour;
    private double bonus;
    
    Scanner input = new Scanner(System.in);

    public NhanVien(String name, int age, String address, double salary, int workHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workHour = workHour;
    }

    NhanVien() {
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAdress(String address){
        this.address = address;
    }
    
    double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    int getWorkHour(){
        return workHour;
    }
    
    public void setWorkHour(int workHour){
        this.workHour = workHour;
    }
    
    void inputInfor(){
        System.out.println("--- Nhap thong tin nhan vien ---");
        System.out.print("Nhap ten: ");
        name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap dia chi: ");
        address = input.nextLine();
        System.out.print("Nhap tien luong: ");
        salary = input.nextDouble();
        System.out.print("Nhap tong so gio lam: ");
        workHour = input.nextInt();
    }
    
     double tinhThuong(){
        if (workHour > 200) {
            bonus = salary * 0.2;
        } else if (workHour < 200 && workHour >= 100) {
            bonus = salary * 0.1;
        } else if (workHour < 100){
            bonus = 0;
        }
        return bonus;
    }
    
    void printInfor(){
        System.out.println("--- Thong tin nhan vien ---");
        System.out.print("> Ten: " + this.name + "\n");
        System.out.printf("> Tuoi: %d \n",this.age);
        System.out.print("> Dia chi: " + this.address + "\n");
        System.out.printf("> Tien luong: %f \n",this.salary);
        System.out.printf("> Tong so gio lam: %d \n",this.workHour);
        System.out.printf("> Tien thuong nhan vien la %1.3f \n",this.tinhThuong());
    }
}
