// practice question
class cellphone{
    String Brand;
    
    
    
    public void ringing(){
        System.out.println("Ringing!");
    }
    
    public void vibrate(){
        System.out.println("Your mobile is vibrating zzz!!");
    }
}

public class practice2{
    public static void main(String[]args){
        cellphone Phone = new cellphone();
        Phone.Brand = "Apple";
        Phone.vibrate();
        Phone.ringing();
        
    }
}
