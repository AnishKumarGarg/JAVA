// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person {
    String PersonName;
    int PersonAge;

    public Person(String name, int age) { // Dont put void or int before constructor name
        PersonName = name;
        PersonAge = age;
    }

    public static void main(String[] args) {
        Person student1 = new Person("Anil", 20);
        Person student2 = new Person("Mukesh", 25);
        System.out.println(student1.PersonName + " " + student1.PersonAge);
        System.out.println(student2.PersonName + " " + student2.PersonAge);

    }
}
