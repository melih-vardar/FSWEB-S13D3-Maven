package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);
        Person person1 = new Person("Halil", "Badem", 39, "175cm", "90kg", "Male");

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("is teen: " + person.isTeen());
        System.out.println("************************");
        System.out.println("Age: " + person1.age);
        System.out.println("Gender: " + person1.gender);
        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("************************");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
