public class cars {
    public static void main(String[] args) {
        prop car1 = new prop();
        prop car2 = new prop();
        prop car3 = new prop();

        car1.Brand = "Maruti Suzuki";
        car1.model = "Alto";
        car1.make = 2021;

        car2.Brand = "Porsche";
        car2.model = "Camaro";
        car2.make = 2022;

        car3.Brand = "BMW";
        car3.model = "A5";
        car3.make = 2020;

        System.out.println(car1.Brand + " " + car1.model + " " + car1.make);
        System.out.println(car2.Brand + " " + car2.model + " " + car2.make);
        System.out.println(car3.Brand + " " + car3.model + " " + car3.make);
        prop.congo();

    }

}

class prop {
    String Brand;
    String model;
    int make;

    static void congo() {
        System.out.println("Congratulations for a new car!");
    }
}
