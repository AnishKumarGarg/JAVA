public class classPractice {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(12, 14);
        System.out.println("Length=" + myRectangle.getLength());
        System.out.println("Breadth=" + myRectangle.getBreadth());
        System.out.println("Perimeter=" + myRectangle.getPerimeter());
    }

}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getPerimeter() {
        return 2*(length + breadth);
    }
}
