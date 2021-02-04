package ObjectOrientedProgramming;

class Scholar {
    // 'THIS' KEYWORD //
    //////////////////////////////////////////////////////////////////////////////
    public String name;
    public String cohort;
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
