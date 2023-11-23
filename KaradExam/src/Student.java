import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    int standard;
    double marks;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", standard=" + standard +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollno, String name, int standard, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.standard = standard;
        this.marks = marks;
    }

    void accept(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Unique Roll No : ");
        this.rollno = scn.nextInt();
        System.out.println("Enter Name : ");
        this.name = scn.next();
        System.out.println("Enter Standard : ");
        this.standard = scn.nextInt();
        System.out.println("Enter Marks : ");
        this.marks = scn.nextDouble();
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
