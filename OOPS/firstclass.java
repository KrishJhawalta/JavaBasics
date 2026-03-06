// only one public class is allowed in java file
class employee{
    int id; 
    String name;
    int age;

    // creating a function to print the value of id and name to preven DRY Code
    public void show(){
        System.out.println("ID Number is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}

public class firstclass{
    public static void main(String[]args) {
        System.out.println("This is my first classs");

        // creating class and object
        employee James = new employee();     // creating object 
        employee John = new employee();     // creating object
        James.id = 007;                      // assigning value to id
        James.name = "James Bond";          // assigning value
        James.age = 30;      
        John.id = 81;
        John.age = 21;               // assigning value to age

        // printing the value of id and name
        System.out.println(James.id);
        System.out.println(James.name); 

        // Using function to print the value of id and name 
        James.show();
        John.show();
}}