// Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getheight() {
        return height;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getwidth() {
        return width;
    }

    public int getarea() {
        return height * width;
    }

    public int getperimeter() {
        return 2 * (height + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 24);
        System.out.println("Height= " + rectangle.getheight());
        System.out.println("Width= " + rectangle.getwidth());
        System.out.println("Area of rectangle is " + rectangle.getarea());
        System.out.println("Perimeter of rectangle is " + rectangle.getperimeter());
        System.out.println(" ");
        rectangle.setheight(7);
        rectangle.setwidth(12);
        System.out.println("New Height= " + rectangle.getheight());
        System.out.println("New Width= " + rectangle.getwidth());
        System.out.println("New Area of rectangle is " + rectangle.getarea());
        System.out.println("New Perimeter of rectangle is " + rectangle.getperimeter());

    }
}
