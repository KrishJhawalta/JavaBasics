package OOPS.Inheritance;

class students{
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
public class inherit {
    static void main(String[]args) {
        students s= new students();
        s.setName("popeye");
        System.out.println(s.getName());



    }
}
