package InterfacesAndAbstractClasses;

class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "holding meetings";
    }
}
