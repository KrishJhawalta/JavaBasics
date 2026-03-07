package PraticeQ;

public class practice3 {
    public static void main(String[]args){

        //Question1: Program to convert string into lowercase
        String name = "Iron_Man";
        System.out.println(name.toLowerCase());

        //Question2: Progarm that replaces spaces with underscores
        String name1 = "Thor the wonder";
        System.out.println(name1.replace(' ','_'));

        //Question3: Program fill letter : letter = 'Dear' <name> thanks a lot
        String letter1 = "Dear <name>, Thanks a lot";
        System.out.println(letter1.replace("<name>","Krish"));

        //Question4: Program that detect the double and triple spaces in a string
        String detect = "hello   ,  ";
        System.out.println(detect.replace("   "," doublespace"));

        //Question5: Program that use the escape
        String template = "Dear Harry, This Java Course is nice. Thanks";
        System.out.println("\""+template+"\"");













    }
    
}
