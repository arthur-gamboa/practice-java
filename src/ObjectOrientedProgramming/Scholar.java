package ObjectOrientedProgramming;

class Scholar {
    // 'THIS' KEYWORD //
    //////////////////////////////////////////////////////////////////////////////
    public String name;
    public String cohort;
    //grade is defined as private, but we've also created a method to allow
    //access to (but not re-assigning) the property named shareGrade.
    private double grade;

//    public Scholar(String name) {
//        this(name, "Unassigned");
//    }

    public Scholar(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double shareGrade() {
        return grade;
    }

//    public Scholar(String name, String cohort) {
//        this.name = name;
//        this.cohort = cohort;
//    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }
}
