/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package week3;

public class App {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        double[] tmpD = {100, 200, 300, 400, 500};
        car1.gasPedal(tmpD);
        car1.gasPedal(tmpD);
        for(Car car : carArray)
        {
            System.out.println("car.gear : " + car.gear);
        }
    }
}
