public class Car {
    private String name;
    private String color;
    public static int numberofCar;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        numberofCar++;
    }
    void display() {
        System.out.println(name + " " + color );
    }
}
