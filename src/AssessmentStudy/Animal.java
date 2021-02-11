package AssessmentStudy;

//TODO: 3. Create an Animal class. It should have private instance properties for a name and species, and public getters and setters for both.
public class Animal {
    public static void main(String[] args) {

        Animal tiger = new Animal();
        tiger.name = "Tiger";
    }

    //Private instances
    private String name;
    private String species;

    //Getters
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

//TODO: 4. Within your Animal class, define an instance method named roar. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where $NAME is replaced with the value of the name property for that object.
    public String roar() {
        return "I am " + getName() + ", hear me roar!";
    }

}

