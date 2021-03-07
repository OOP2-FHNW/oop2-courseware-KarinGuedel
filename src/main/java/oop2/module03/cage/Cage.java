package oop2.module03.cage;

import oop2.module02.Person;
import oop2.module03.cage.animal.Animal;

import java.util.HashSet;
import java.util.Set;

public class Cage <T> {
    private final Set<T> animals = new HashSet<>();   //wie komme ich aus dem Test auf den Datentyp HashSet?

    public Cage() {
    }

    public void jail(T animal) {
        animals.add(animal);
    }
    public boolean shelters(T animal) {
        return animals.contains(animal);
    }

    public int numberOfAnimals() {
        return animals.size();
    }

    public void setFree(T animal) {
        animals.remove(animal);
    }

    public static <A extends Animal> void jailAll(Cage<A> cage, A[] allAnimals) {  //wie komme ich auf diese Datentypen??
        // ich übergebe einen Käfig vom generischen Datentyp A udn eine Array vom generischen Datentyp A mit allen Tieren
        for (A animal : allAnimals) {
            cage.jail(animal);  //ich gehe das Array von 0 bis n durch und wende auf jedes Tier die jail-Methode an
        }
    }
}
