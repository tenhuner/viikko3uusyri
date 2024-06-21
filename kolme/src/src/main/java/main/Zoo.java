package main;


import java.util.ArrayList; //Import brings class from standard library.

public class Zoo { //definition of the Znimal class
    private String name; //Defines a variable for internal use
    private ArrayList<Animal> animals; //Defines a variable for internal use

// This is the constructor for the Zoo class
// The constructor takes two parameters: name and animals
// When a new Zoo object is created, this information is passed to the constructor
    public Zoo(String name) {
        this.name = name; //*this.variable* refers to a private field of class Zoo private String *variable*
        this.animals = new ArrayList<>(); //*this.variable* refers to a private field of class Zoo private String *variable*. Array lists tells that animals is list. 
    }
// Method to add a new animal to the zoo
    public void addAnimal(Animal animal) {
        animals.add(animal); // Add the given animal to the ArrayList
    }
// Method that lists all the animals in the zoo
    public void listAnimals() {
        System.out.println(name + " pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals) { // Go through each animal in the animals list and print it
            System.out.println(animal); // prints a single animal every time the for loop runs
        }
    }

    public void runAnimals(int laps) { 
        for (int i = 0; i < laps; i++) { // The outer loop repeats the given number of rounds
            for (Animal animal : animals) { // The inner loop goes through all the animals and calls their run method
                animal.run(); // Calls the run method of the Animal class
            }
        }
    }
}
