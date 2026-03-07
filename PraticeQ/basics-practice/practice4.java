package practice4;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {

        // Question1: what will be the output
      /*  int a = 10;
        if(a=11){
            System.out.println("I am 11");
        }else{
            System.out.println("I am not 11");
        } */

        // Question2:Check whether a student is pass or fail (to pass 40% and least 30% ) with 3 subjects
        int marks1 = 56;
        int marks2 = 9;
        int marks3 = 0;
        double percentage = (marks1 + marks2 + marks3) * 100 / 300;
        System.out.println(percentage);
        if (percentage > 40) {
            System.out.println("Congrats your'e pass!");
        } else {
            System.out.println("\"Bro! Next time...\"");
        }

        //Question3: Tax according to income of employees
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double Employee1_salary = sc.nextInt();
        if (Employee1_salary <= 2.5) {
            System.out.println("No tax!");
        } else if (Employee1_salary > 2.5 && Employee1_salary <= 5.0) {
            System.out.println("5% Tax");
        } else if (Employee1_salary > 5.0 && Employee1_salary <= 10.0) {
            System.out.println("20% Tax ");
        } else {
            System.out.println("30% Tax");
        }


        //Question4: Counting for 123 to Monday
        System.out.print("Enter number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" Invalid");
        }


        // Question5: Check whether a year is leap or not
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("It is leap");
        } else {
            System.out.println("It is not");
        }

        //Question6: check type of website from domain
        String url = "https://google.com";
        if (url.endsWith(".org")){
            System.out.println("Organisation");
        }else if(url.endsWith(".com")){
            System.out.println("Commercial");}
        else if(url.endsWith(".in")){
            System.out.println("Indian web");
        }else {
            System.out.println("Error");
        }}}







    
