package ObjectOrientedProgramming;

class Person {

    // two instance variables, or properties
    public String firstName;
    public String lastName;

    // defined instance method, sayHello
    // notice we can refer to firstName and lastName
    public String sayHello() {
        return String.format("Hello, from %s %s!", firstName, lastName);
    }

    //////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS //
    //////////////////////////////////////////////////////////////////////////////
    public Person() {
        System.out.println("A person is being created.");
    }

    // THE 'THIS' KEYWORD //
    //////////////////////////////////////////////////////////////////////////////
        private String name1;

        //'this' keyword provides us a way to refer to the current instance. you can think
        //of 'this' as saying "this object". you can only use the 'this' keyword inside
        //of an instance method, as it is an error to do so elsewhere.
        public Person(String name) {
            this.name1 = name;
        }

//        public sayHello() {
//            return String.format("%s says hello!", this.name1);
//        }


    public static long worldPopulation = 7_500_000_000L;  // class property
    public String name;  //instance property

    public static void main(String[] args) {

        // inside the main method, we created an instance of our Person class.
        // used the new keyword, along with the name of the class, followed by
        // an empty set of parenthesis to create the instance
        Person rick = new Person();
        // set values to the firstName and lastName fields, then called
        // the sayHello method and print the message it returns.
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"

        Person john = new Person();
        john.firstName = "Arthur";
        john.lastName = "Gamboa";

        Person jenn = new Person();
        jenn.firstName = "Jennifer";
        jenn.lastName = "Moreno";

        System.out.println(john.sayHello());
        System.out.println(jenn.sayHello());

        ///////////////////////////////////////////////////////////////////////

        Person theBestDrummerAlive = new Person();
        theBestDrummerAlive.name = "Neil Peart";

        Person.worldPopulation += 1;  //accessing a static property

        System.out.println(Person.worldPopulation);  //7500000001

        //technically this will work, but it is usually better to reference
        //static properties through the class, not instances
        System.out.println(theBestDrummerAlive.worldPopulation);  //7500000001

//        //DO NOT DO THIS, it will not compile
//        System.out.println(Person.name);  //uncomment to see error


        // CONSTRUCTORS //
        //////////////////////////////////////////////////////////////////////////////
        Person p1 = new Person();   //will print out "A person is being created.
        Person p2 = new Person();   //will print out "A person is being created.




    }
}
