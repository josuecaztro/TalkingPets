package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    static ArrayList<String> petList = new ArrayList<String>();


    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int userPetAmount = scanner.nextInt();

        for (int i = 0; i < userPetAmount; i++) {

            scanner.nextLine();
            System.out.println("What kind of pet is it?");
            String userTypePet = scanner.nextLine();

            System.out.println("What is the pet's name?");
            String userPetName = scanner.nextLine();

            petList.add(userTypePet + " : " + userPetName);
            System.out.println("Pet stored. Press Enter to continue.");

        }

        for (String x : petList){
            System.out.println(x);
        }






    }
}
