class Employee{
    int id;
    String name;
    int salary;

    public void getsalary(){       // method to print salary
        System.out.println("Salary is: "+salary);
    }
    public void getName(){        // method to print name
        System.out.println("Name is: "+name);
    }
    public void setName(String n){   // method to set name
        name = n;
    }
  
   }

public class practice1 {
    public static void main(String[]args){

        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Harry";
        emp1.setName("Krish");
        emp1.salary = 50000;
        
        // printing the details of employee
        emp1.getsalary();
        emp1.getName();


    }



}
