package week3;

import org.checkerframework.checker.units.qual.km;

public class Car {
    String company;
    String model;
    String color;
    
    double price;
    double valocity;
    char gear;
    boolean lights;

    Tire tire = new Tire();
    Door door;
    Handle handle;

    public Car() {
        
    }

    public double gasPedal(double[] kmh) {
        for(double d : kmh)
        {
            System.out.println(d);
            valocity = d;
            d += 10;
        }
        
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
