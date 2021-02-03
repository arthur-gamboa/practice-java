package InheritancePractice;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    protected String otherName;
    private int age;

    public Person() {

    }

    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
