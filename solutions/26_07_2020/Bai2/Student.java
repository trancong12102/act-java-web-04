
package Object.Bai2;

import java.util.Scanner;

public class Student {
    private String MSV;
    private float DTB;
    private int Age;
    private String Class;
    
    public Student(){}
    
    public Student(String MSV, float DTB, int Age, String Class){
        this.MSV = MSV;
        this.DTB = DTB;
        this.Age = Age;
        this.Class = Class;
    }
    String getMSV(){
        return MSV;
    }
    void setMSV(String MSV){
        this.MSV = MSV;
    }
    float getDTB(){
        return DTB;
    }
    void setDTB(float DTB){
        this.DTB = DTB;
    }
    int getAge(){
        return Age;
    }
    void setAge(int Age){
        this.Age = Age;
    }
    String getclass(){
        return Class;
    }
    void setclass (String Class){
        this.Class = Class;
    }
    void inputInfo(){
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<=1;i++){
            System.out.print("Nhập mã sinh viên: ");
            MSV = input.nextLine();
            if (MSV.length() != 8){
                System.out.println("Mã sinh viên nhập sai, yêu cầu nhập lại!");
                i = 0;
            }
        }    
        for (int i = 0;i<=1;i++){
            System.out.print("Nhập điểm trung bình của sinh viên: ");
            DTB = input.nextFloat();
            if (DTB < 0 || DTB > 10){
                System.out.println("Điểm trung bình nhập sai, yêu cầu nhập lại!");
                i = 0;
            }
        }
        for (int i = 0;i<=1;i++){
            System.out.print("Nhập tuổi của sinh viên: ");
            Age = input.nextInt();
            input.nextLine();
            if (Age < 18){
                System.out.println("Tuổi sinh viên nhập sai, yêu cầu nhập lại!");
                i = 0;
            }
        }
        for (int i = 0;i<=1;i++){
            System.out.print("Nhập lớp của sinh viên: ");
            Class = input.nextLine();
            if (Class.charAt(0)!='A'&& Class.charAt(0)!='C'){
                System.out.println("Lớp của sinh viên nhập sai, yêu cầu nhập lại!");
                i = 0;
            }
        }
    }
    void showInfo(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println(" - Mã sinh viên: "+MSV);
        System.out.println(" - Điểm trung bình: "+DTB);
        System.out.println(" - Tuổi sinh viên: "+Age);
        System.out.println(" - Sinh viên lớp: "+Class);
        System.out.println(Scholarship());
    }
    String Scholarship(){
        String Scholar;
        if(DTB>8)
            Scholar = " - Sinh viên được nhận học bổng";
        else
            Scholar = " - Sinh viên không được nhận học bổng";
        return Scholar;
    }
}
