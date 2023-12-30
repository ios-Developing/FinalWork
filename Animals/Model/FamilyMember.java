package Model;

import java.io.Serializable;

public class FamilyMember<T extends Animal> extends Animal implements Serializable, Comparable<T> {
    private String familyStatus;
    private Animal animal;

    public FamilyMember addFamilyMemberStatus(String familyStatus, Animal animal) {
        this.familyStatus = familyStatus;
        this.animal = animal;
        return this;
    }

    public int getAgeFamilyMember() {
        return animal.getAge();
    }

    public String getNameFamilyMember() {
        return animal.getName();
    }

    @Override
    public String toString() {
        return "Животное: " + animal.toString() + "\n";
    }

    @Override
    public int compareTo(T o) {
        return animal.getName().compareTo(o.getName());
    }
}

