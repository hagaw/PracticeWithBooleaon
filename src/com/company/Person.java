package com.company;

public class Person {

    private String name;
    private boolean likeFrenchFries;
    private boolean likeSleeping;
    private boolean areAdventurous;

    public Person() {
    }

    public Person(String name, boolean likeFrenchFries, boolean likeSleeping, boolean areAdventurous) {
        this.name = name;
        this.likeFrenchFries = likeFrenchFries;
        this.likeSleeping = likeSleeping;
        this.areAdventurous = areAdventurous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLikeFrenchFries() {
        return likeFrenchFries;
    }

    public void setLikeFrenchFries(boolean likeFrenchFries) {
        this.likeFrenchFries = likeFrenchFries;
    }

    public boolean isLikeSleeping() {
        return likeSleeping;
    }

    public void setLikeSleeping(boolean likeSleeping) {
        this.likeSleeping = likeSleeping;
    }

    public boolean isAreAdventurous() {
        return areAdventurous;
    }

    public void setAreAdventurous(boolean areAdventurous) {
        this.areAdventurous = areAdventurous;
    }
}
