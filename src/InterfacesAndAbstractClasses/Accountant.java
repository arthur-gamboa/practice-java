package InterfacesAndAbstractClasses;

class Accountant extends Employee {
    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "crunching numbers";
    }
    public String salary() {
        return "$$$";
    }
}
