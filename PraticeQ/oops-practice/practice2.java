// Q2: cylinde formula using getter and setter: area & volume
class cylinder{
private int radius;
private int height;

public void setHeight(int h){
height = h; }
public void setRadius(int r){
radius =r;}

public double getVolume(){
return 3.14*radius*radius*height;}

public double getArea(){
return 2*3.14*radius*(radius+height);
}}

public class practice2{
public static void main(String[]args){
cylinder c1 = new cylinder();
c1.setRadius(2);
c1.setHeight(3);
System.out.println("Volume is: "+c1.getVolume());
System.out.println("Area is: "+c1.getArea());

}
	}
