//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Messesdes", "Red");
        System.out.println(Car.numberofCar);
        Car car2 = new Car("Mazda5","Blue");
        System.out.println(Car.numberofCar);
        car1.display();
        car2.display();
    }
}