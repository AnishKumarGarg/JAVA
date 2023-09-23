public class Vehicle {
    String brand = "Ford";

    public void Honk() {
        System.out.println("tuut tuut!!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.brand + " " + myCar.modelName);
        myCar.Honk();
    }
}

class Car extends Vehicle {
    String modelName = "Mustang";

}
