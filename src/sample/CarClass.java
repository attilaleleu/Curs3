package sample;

// *** Using classes to give care specification ***

class CarType{
    String model;
    int maxspeed;
    //int breaking;
    double engine;
    int speed = 0;


    CarType(String model, double engine, int maxspeed){
        this.model = model;
        this.engine = engine;
        this.maxspeed = maxspeed;

    }

    void textToPrint(){
        System.out.println("The " + model + " series having a " + engine + " litre enigine, a has a max speed of " + maxspeed + " km/h.");
    }

    void speedUp(int increment){
        speed = speed + increment;
    }


}

public class CarClass {
    public static void main(String[] args) {
        System.out.println("Welcome! \n");
        System.out.println("This program shows a few of BMW's M division specifications. \n");


        CarType car1 = new CarType("M3", 3.2, 250);
        CarType car2 = new CarType("M5", 5.5, 270);
        CarType car3 = new CarType("M6", 6.0, 300);

        car1.textToPrint();
        car2.textToPrint();
        car3.textToPrint();
    }
}
