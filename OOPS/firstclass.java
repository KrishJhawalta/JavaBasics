// only one public class is allowed in java file
class employee{
    int id; 
    String name;
}

public class firstclass{
    public static void main(String[]args) {
        System.out.println("This is my first classs");
        
        employee James = new employee();
        James.id = 007;
        James.name = "James Bond";
        System.out.println(James.id);
        System.out.println(James.name); 
}}