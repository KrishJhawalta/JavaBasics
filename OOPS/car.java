class car1 {

    int model;
    String color;

    public void show() {
        System.out.println("Model is: " + model);
        System.out.println("Color is: " + color);
    }
}

public class car {

    public static void main(String[] args) {
        //Car 1
        car1 Audi = new car1();
        Audi.model = 2015;
        Audi.color = "White";

        // Car 2
        car1 bmw = new car1();
        bmw.model = 2016;
        bmw.color = "Red";

        // Printing the functions
        Audi.show();
        bmw.show();
    }
}
