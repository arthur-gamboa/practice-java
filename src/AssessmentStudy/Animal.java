package AssessmentStudy;

import java.util.ArrayList;

//TODO: 3. Create an Animal class. It should have private instance properties for a name and species, and public getters and setters for both.
public class Animal extends Assessment {
    public static void main(String[] args) {

        Animal houseCat = new Animal();
        houseCat.setName("Kitty"); //If not in Animal Class, .setName is relevant to call in other classes
        houseCat.setSpecies("Felis catus");
        houseCat.roar();

        Animal tiger = new Animal();
        tiger.name = "Tiger";
        tiger.setSpecies("Feliz catuz");
        System.out.println(tiger.getName());
        System.out.println(tiger.roar());

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(houseCat);
        animals.add(tiger);
        System.out.println(animals);

//        Animal.catRemoval(animals);
//        System.out.println(animals);

        for (Animal animal : animals) {
            System.out.println(animal.catRemoval(animals));
        }

    }

    //Private Instances
    private String name;
    private String species;

    //Getters
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
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
        return "I am " + name + ", hear me roar!";
    }

}

