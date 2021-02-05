package InterfacesAndAbstractClasses;

// abstract classes can define abstract methods, which are
// methods with no body, they only provide information
// about the method name, return type, and parameters.
abstract class Employee {
    public abstract String work();
//    public abstract String salary();

    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
