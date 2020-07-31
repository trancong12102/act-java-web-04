/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class Student {
    private String stCode;
    private float avg;
    private int age;
    private String unit;

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Student() {
    }

    public Student(String stCode, float avg, int age, String unit) {
        this.stCode = stCode;
        this.avg = avg;
        this.age = age;
        this.unit = unit;
    }
    
      Scanner sc = new Scanner(System.in);  
      
    void inputInfo(){
        System.out.println("nhap thong tin hov vien");
        System.out.println("student code? > (toi da 8 ki tu)");
        do {            
             this.stCode = sc.nextLine(); 
        } while (this.stCode.length()!=8);
         System.out.println("avg? > ");
        do {            
             this.avg = sc.nextFloat();
        } while (this.avg > 10 && this.avg < 0 );      
        System.out.println("age? > ");
        do {            
            this.age =sc.nextInt();
        } while ( this.age <18);       
        sc.nextLine();
        System.out.println("class? > ");
        do {            
              this.unit = sc .nextLine();
        } while (this.unit.charAt(0) != 'A' || this.unit.charAt(0) != 'C' );
      
        
//        do{
//             this.stCode = sc.nextLine();
//        }while (this.stCode.length() > 8) ;            
//            
//        }      
//        if(){
//            System.out.println("qua so ki tu toi da, moi nhap lai");
//            this.stCode = sc.nextLine();
//        }
        
    } 
    
    void printInfo(){
        System.out.println("thong tin hv vua nhap > ");
        System.out.println(this.stCode);
        System.out.println(this.age);
        System.out.println(this.avg);
        System.out.println(this.unit);
        
    }
    boolean hightavg(){
        return this.avg > 8;          
    }
    void isHight(){
        if(hightavg()== true){
            System.out.println("hv dc hoc bong");
        }
        else{
             System.out.println("hv ko dc hoc bong");
        }
    }
    
}
