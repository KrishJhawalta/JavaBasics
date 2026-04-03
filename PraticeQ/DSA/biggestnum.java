package PraticeQ.DSA;

public class biggestnum {
    public static void main() {

        int [] arr = {1,55,2,5,7,8};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }

        
    }
}
