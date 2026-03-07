class Employee{
    int id;
    String name;
    int salary;

    public void getsalary(){
        System.out.println("Salary is: "+salary);
    }
    public void getName(){
        System.out.println("Name is: "+name);
    }
    public void setName(String n){
        name = n;
    }
  
   }

public class employee {
    public static void main(String[]args){
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Harry";
        emp1.setName("Krish");
        emp1.salary = 50000;
        emp1.getsalary();
        emp1.getName();


    }



}
