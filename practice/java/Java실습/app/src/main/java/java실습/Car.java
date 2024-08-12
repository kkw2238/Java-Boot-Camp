public class Car {
    String company;
    String model;
    String color;
    
    double price;
    double valocity;
    char gear;
    boolean lights;

    Tire tire;
    Door door;
    Handle handle;

    public Car() {
        
    }

    public double gasPedal(double kmh) {
        valocity = kmh;
        return valocity;      
    }

    public double breakPedal() {
        valocity = 0.0;
        return valocity;
    }

    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    public void horn() {
        System.out.println("빵");
    }
}
