package procedure03.problem06.entity;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public static void printInfo(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            System.out.print(a);
        }
    }

    @Override
    public String toString() {
        return name + "(" + species + ", " + age + "살) ";
    }
}
