package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Person> personality = new ArrayList();


        String response = "";

        do {

            System.out.println("your name ? ");
            String userInputName = sc.nextLine();
            System.out.println("do you like french frice");
            boolean userInputFrenchFrice = sc.nextBoolean();
            System.out.println("do you like sleeping");
            boolean userInputSleep = sc.nextBoolean();
            System.out.println("are you adventureous ?");
            boolean userInputAdventure = sc.nextBoolean();

            sc.nextLine();

            personality.add(new Person(userInputName, userInputFrenchFrice, userInputSleep, userInputAdventure));

            System.out.println("do you want to continue ? ");

            response = sc.nextLine();

        }
        while (!response.equalsIgnoreCase("no"));

        for (Person perontp:personality ){
            System.out.println("Name " + perontp.getName());
            System.out.println("like french frice "+perontp.isLikeFrenchFries());
            System.out.println("Like to sleep "+ perontp.isLikeSleeping());
            System.out.println("is Adventus " + perontp.isAreAdventurous());


             }

    }
}