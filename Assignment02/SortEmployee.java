import java.util.Scanner;

public class SortEmployee {

   public static Employee[] sortedEmployee(Employee []arr){

       for(int i = 0;i<arr.length;i++) {
           double temp = arr[i].getSalary();
           Employee emp = arr[i];
           int j = i;
           while (j > 0 && arr[j - 1].getSalary() > temp) {
               arr[j] = arr[j-1];
               j--;
           }
           arr[j] = emp;
       }
       return arr;
   }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee emp[] = new Employee[4];

        System.out.println("Enter Employees Details : ");
        for(int i = 0;i< emp.length;i++){
            System.out.print("\nEnter Employee ID : ");
            int id = scn.nextInt();
            System.out.print("\nEnter Employee Name : ");
            String name = scn.next();
            System.out.print("\nEnter Salary : ");
            double salary = scn.nextDouble();

            emp[i] = new Employee(name,id,salary);
        }

        Employee[] sortedEmployee = sortedEmployee(emp);

        System.out.print("\nSorted Employee : ");
        for(Employee em:sortedEmployee){
            System.out.print("\n"+em);
        }
    }
}
