package Activities;

public class Car {
    //variable initialize
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;
    //Constructor
    Car() {
        tyres = 4;
        doors = 4;
    }
    //class methods
    public void displayCharacteristics(){
        System.out.println("Color of the Car:" +color);
        System.out.println("Make of the Car:" +make);
        System.out.println("Transmission of the Car:" +transmission);
        System.out.println("Number of doors on the Car:" +doors);
        System.out.println("Number of tyres on the Car:" +tyres);
    }

    public void accelerate(){
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped");
    }
}
