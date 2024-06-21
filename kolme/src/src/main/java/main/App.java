package main;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna eläintarhalle nimi:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);

        while (true) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            String command = scanner.nextLine();

            if (command.equals("0")) {
                System.out.println("Kiitos ohjelman käytöstä.");
                break;
            } else if (command.equals("1")) {
                System.out.println("Mikä laji?");
                String species = scanner.nextLine();
                System.out.println("Anna eläimen nimi:");
                String name = scanner.nextLine();
                System.out.println("Anna eläimen ikä:");
                int age = Integer.parseInt(scanner.nextLine());
                Animal animal = new Animal(species, name, age);
                zoo.addAnimal(animal);
            } else if (command.equals("2")) {
                zoo.listAnimals();
            } else if (command.equals("3")) {
                System.out.println("Kuinka monta kierrosta?");
                int laps = Integer.parseInt(scanner.nextLine());
                zoo.runAnimals(laps);
            } else {
                System.out.println("Syöte oli väärä");
            }
        }

        scanner.close();
    }
}
