package InheritancePractice;

public class Employee extends Person {

    public String getName() {
        return this.otherName;
    }
//    public String getAge() {
//        // error, age property is private
//        return this.age;  /* uncomment this line for error message */
//    }

    public Employee(String employeeName) {
        super(employeeName);
    }

    private double salary;

    public Employee() {

    }

    public void doWork() {
        System.out.println("Work, work...");
    }

    // method overriding
    public void sayHello() {
        System.out.println("How can I help you?");
    }

    public static void main(String[] args) {
//       Employee john = new Employee("John");
//       john.sayHello();
//       System.out.println(john.name);

//        Person p = new Person();
//        Employee e = new Employee();
//        e.sayHello();
//        e.doWork();
        Person person = new Person();
        Employee employee = new Employee();
        person.sayHello();
        employee.sayHello();
    }
}
