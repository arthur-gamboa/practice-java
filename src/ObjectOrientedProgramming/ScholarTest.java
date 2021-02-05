package ObjectOrientedProgramming;

class ScholarTest {
    public static void main(String[] args) {
        Scholar scholar = new Scholar("John Doe", 82.4);

        System.out.println(scholar.name);  // John Doe

//        //DO NOT DO THIS - private properties cannot be accessed outside the class
//        System.out.println(scholar.grade);

        System.out.println(scholar.shareGrade()); // Do this instead
    }
}
