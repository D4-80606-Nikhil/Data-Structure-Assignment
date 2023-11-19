import java.util.Scanner;

public class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        String name;
        int empid;
        double salary;
        Scanner scn = new Scanner(System.in);

        for(int i = 0;i<emp.length;i++){
            System.out.println("Enter Employee Details : ");
            System.out.print("\nEnter Name : ");
            name = scn.next();

            System.out.print("\nEnter EmpId : ");
            empid = scn.nextInt();

            System.out.print("\nEnter Salary : ");
            salary = scn.nextInt();

            emp[i] = new Employee(name,empid,salary);
        }

        empIdSearching(emp,scn);
        nameSearching(emp,scn);
        salarySearching(emp,scn);

    }

    public static void empIdSearching(Employee []emp,Scanner scn){
          int id ;
          int flag = 0;
          System.out.println("Enter EmpId : ");
          id = scn.nextInt();

          for(int i = 0;i< emp.length;i++){
              if(id == emp[i].getEmpId()){
                  System.out.println("Employee Found :) ");
                  flag = 1;
                  break;
              }
          }

          if(flag ==0){
              System.out.println("Employee Not Found :(");
          }

    }


    public static void nameSearching(Employee []emp,Scanner scn){
        String name ;
        int flag = 0;
        System.out.println("Enter Name : ");
        name = scn.next();

        for(int i = 0;i< emp.length;i++){
            if(name.equals(emp[i].getName())){
                System.out.println("Employee Found :) ");
                flag = 1;
                break;
            }
        }

        if(flag ==0){
            System.out.println("Employee Not Found :(");
        }

    }

    public static void salarySearching(Employee []emp,Scanner scn){
        double salary ;
        int flag = 0;
        System.out.println("Enter Salary : ");
        salary = scn.nextDouble();

        for(int i = 0;i< emp.length;i++){
            if(salary == emp[i].getSalary()){
                System.out.println("Employee Found :) ");
                flag = 1;
                break;
            }
        }

        if(flag ==0){
            System.out.println("Employee Not Found :(");
        }

    }



}
