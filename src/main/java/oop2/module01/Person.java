package oop2.module01;

import java.util.Objects;

/**
 * @author Dieter Holz
 */
public class Person {
    private int    age;
    private double weight;
    private double height;
    private Person[] friends;

    public Person(int age, double weight, double height) {
        this.age    = age;
        this.weight = weight;
        this.height = height;
        friends = new Person[10];
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public void newFriend(Person friend) {
        if(hasAsFriend(friend)){
            return;
        }

        for (int i = 0; i < friends.length; i++) {
            if(friends[i] == null){
                friends[i] = friend;
                break;
            }
        }

        friend.newFriend(this);
    }

    public boolean hasAsFriend(Person person) {
        for (Person f : friends) {
            if (Objects.equals(f, person)) {
                return true;
            }
        }
        return false;
    }

    public int numberOfFriends() {
        int counter = 0;
        for (Person f : friends) {
            if (f != null) {
                counter++;
            }
        }
        return counter;
    }

    public void noFriend(Person friend) {
        if(hasAsFriend(friend)){
            for (int i = 0; i < friends.length; i++) {
                if(Objects.equals(friends[i], friend)){
                    friends[i] = null;
                    break;
                }
            }
            friend.noFriend(this);
        }
    }

    //alle Getter und Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
