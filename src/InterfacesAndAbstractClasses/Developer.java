package InterfacesAndAbstractClasses;

class Developer extends Employee {
    public Developer(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "writing code";
    }
}
