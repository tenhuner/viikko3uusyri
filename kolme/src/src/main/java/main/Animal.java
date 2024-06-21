package main;


public class Animal { //definition of the Animal class
    private String species; //Defines a variable for internal use
    private String name; //Defines a variable for internal use
    private int age; //Defines a variable for internal use


// This is the constructor for the Animal class
// The constructor takes three parameters: species, name and age
// When a new Animal object is created, this information is passed to the constructor
    public Animal(String species, String name, int age) { 
        this.species = species; //*this.variable* refers to a private field of class Animal private String *variable*
        this.name = name; //*this.variable* refers to a private field of class Animal private String *variable*
        this.age = age; //*this.variable* refers to a private field of class Animal private String *variable*
    }
//public: This access restriction means that the method can be called from any other class.
//get*Variable*(): This is the name of the method. The following is a general rule for naming getters in the form get*Variable*, where *Variable* is the name of the field that the getter returns.
//return *variable*: This returns the value of the object's *variable* field. variable is a private field, so it cannot be directly accessed from outside the class, but through the getter it is possible.
    public String getSpecies() { 
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//public: This access restriction means that the method can be called from any other class.
//void: This is the return type of the method, which means that the method does not return any value.
//run(): This is the name of the method. It doesn't take any parameters
    public void run() {
        System.out.println(name + " juoksee kovaa vauhtia!");
    }
//@Override: This method overwrites
//    @Override
    public String toString() {
        return species + ": " + name + ", " + age + " vuotta";
    }
}
