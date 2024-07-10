package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    static ArrayList<String> petList = new ArrayList<String>();


    public static void main(String[] args) {
        Pet pet = new Pet();
        Dog dog = new Dog(null);
        Cat cat = new Cat(null);
        GuineaPig pig = new GuineaPig(null);


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int userPetAmount = scanner.nextInt();

        for (int i = 0; i < userPetAmount; i++) {
            String petSpeaks = null;
            scanner.nextLine();

            System.out.println("What kind of pet is it?");
            String userTypePet = scanner.nextLine();

            if (userTypePet.equalsIgnoreCase("cat")) {
                petSpeaks = cat.speak();
            } else if (userTypePet.equalsIgnoreCase("dog")) {
                petSpeaks = dog.speak();
            } else if (userTypePet.equalsIgnoreCase("guinea pig")) {
                petSpeaks = pig.speak();
            }

            System.out.println("What is the pet's name?");
            String userPetName = scanner.nextLine();

            petList.add(userPetName + " says : " + petSpeaks);
            if (i == userPetAmount - 1) {
                System.out.println("Pet stored.");
            } else {
                System.out.println("Pet stored. Press [enter] for Next Pet...");
            }
        }

        for (String x : petList){
            System.out.println(x);
        }






    }
}
