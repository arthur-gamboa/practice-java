package ObjectOrientedProgramming;

class Student {
    public String name;
    public String cohort;

    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }


    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B");
        System.out.println(s1.getInfo());   //"name: Student A cohort: Unassigned"
        System.out.println(s2.getInfo());   //"name: Student B cohort: Voyagers"
    }


    // 'THIS' KEYWORD //
    //////////////////////////////////////////////////////////////////////////////
    public String name1;
    public String cohort1;

    public Student(String name1) {
        this(name1, "Unassigned1");
    }
}