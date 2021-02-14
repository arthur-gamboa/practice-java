package AssessmentStudy;

import java.util.ArrayList;

public class Assessment {
    public static void main(String[] args) {

//        Animal.catRemoval(animals);

    }

    //TODO: 1. Create an Assessment class with a public static method named half. It should accept a number and return the number divided by two.
    public static int half(int number) {
        return number / 2;
    }

    //TODO: 2. Within your Assessment class create a public static method named shout. It should accept a string and return the same string in all upper case with three exclamation marks added to the end of it.
    public static String shout(String string) {
        return string.toUpperCase() + "!!!";
    }

//TODO: 5. Within your Assessment class create a public static method named removeCats. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.
    public static ArrayList<Animal>catRemoval(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getSpecies().equals("Felis catus")) {
                animals.remove(i);
            }
        }
        return animals;
    }
}