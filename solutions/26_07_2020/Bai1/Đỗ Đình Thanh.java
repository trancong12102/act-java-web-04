package Bai1;
import java.util.Scanner;

public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int gioLamViec;

     NhanVien() {
        name = "abc";
        age = 10;
        address = "abcdef";
        salary = 10.123 ;
        gioLamViec = 123;
    }

    public NhanVien(String name, int age, String address, double salary, int gioLamViec) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.gioLamViec = gioLamViec;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    public int getGioLamViec() {
        return gioLamViec;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
    
    public void inputInfo(){
        Scanner nhap =new Scanner(System.in);
        System.out.printf("Nhập Tên: ");
        this.name  = nhap.nextLine();
        System.out.printf("Nhập Tuổi: ");
        this.age = Integer.parseInt(nhap.nextLine());
        System.out.printf("Nhập Địa chỉ: ");
        this.address  = nhap.nextLine();
        System.out.printf("Nhập Lương: ");
        this.salary  = nhap.nextDouble();
        System.out.printf("Nhập Tổng Số giờ làm việc: ");
        this.gioLamViec  = nhap.nextInt();
    }
    public void printInfo(){
         System.out.printf("\nTHông tin Nhân Viên:\n");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi :" + address);
        System.out.println("Luong :" + salary);
        System.out.println("Gio lam viec: " + gioLamViec);
        System.out.println("Thuong: " + tinhThuong());
        
    }
    
    double tinhThuong(){
        if(this.gioLamViec >=200)
            return this.salary * 0.2;
        else if(this.gioLamViec >100 )
            return this.salary * 0.1;
        else 
            return 0;
    }
    
    public static void main(String[] args){
        NhanVien x= new NhanVien();
        x.inputInfo();  
        x.printInfo();
        
    }


}