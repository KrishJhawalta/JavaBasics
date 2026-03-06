// only one public class is allowed in java file
class employee{
    int id; 
    int salary;
    String name;
    int age;

    // creating a function to print the value of id and name to prevent repeadition Code
    public void show(){
        System.out.println("ID Number is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Salary is: "+salary);
    }
   
    }


public class firstclass{
    public static void main(String[]args) {
        System.out.println("This is my first classs");

        // creating class and object
        employee James = new employee();     // creating object 
        employee John = new employee();     

        // Assigning values to object
        James.id = 007;                     
        James.name = "James Bond";  
        James.age = 30;  

        John.id = 81;
        John.age = 21;    
        John.salary = 50000;

        // printing the value of id and name || Optional due to function show() created above
      //  System.out.println(James.id);
        // System.out.println(James.name); 

        // Using function to print the value of id and name 
        James.show();
        John.show();
}}