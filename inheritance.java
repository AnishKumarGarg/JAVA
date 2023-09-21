public class inheritance {
    static void honk() {
        System.out.println("Honk Honk!!");
    }

    public static void main(String[] args) {
        car myCar = new car("Porsche", "Carrera", 2019);
        System.out.println(myCar.getbrand() + " " + myCar.getmodel() + " " + myCar.getyear());
        myCar.setyear(2018);
        System.out.println(myCar.getbrand() + " " + myCar.getmodel() + " " + myCar.getyear());
    }
}

class car extends inheritance {
    private String brand;
    private String model;
    private int year;

    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getmodel() {
        return model;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public int getyear() {
        return year;
    }

}
