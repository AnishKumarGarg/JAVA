// Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getcolor() {
        return color;
    }

    public boolean isred() {
        return color.equals("Red");
    }

    public boolean isgreen() {
        return color.equals("Green");
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public int getduration() {
        return duration;
    }

    public static void main(String[] args) {
        TrafficLight sector32Light = new TrafficLight("Red", 30);
        TrafficLight sector20Light = new TrafficLight("Green", 10);
        System.out.println(
                sector20Light.getcolor() + " light for " + sector20Light.getduration() + " seconds in sector 20.");
        System.out.println(
                sector32Light.getcolor() + " light for " + sector32Light.getduration() + " seconds in sector 32.");
        System.out.println(" ");
        System.out.println("Is light green in sector 20: " + sector20Light.isgreen());
        System.out.println("Is light red in sector 20: " + sector20Light.isred());
        System.out.println(" ");

        sector20Light.setColor("Red");
        sector20Light.setduration(120);

        System.out.println("Now " + sector20Light.getcolor() + " light for " + sector20Light.getduration()
                + " seconds in sector 20.");
    }

}
