class cyllinder{
private int radius;
private int height;

public void setRadius(int r){
radius = r;}

public void setHeight(int h){
height = h;}

public int getRadius(){
	return radius;}

public int getHeight(){
return height;}

}

public class practice1{
public static void main(String[]args){
cyllinder c1 = new cyllinder();
c1.setRadius(5);
c1.setHeight(2);
System.out.println(c1.getHeight());
System.out.println(c1.getRadius());

}
}








