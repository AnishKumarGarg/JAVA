abstract class abstract_class {
    public int number=9;
    public void sleep(){
        System.out.println("zzz");
    }
    public static void main(String[] args) {
        Number myNumber=new Number();
        myNumber.declare(); 
        myNumber.sleep();
    }
}
class Number extends abstract_class{
    public void declare(){
        System.out.println("The number is: "+number);
    }
}
