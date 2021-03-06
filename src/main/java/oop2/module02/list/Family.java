package oop2.module02.list;

import oop2.module02.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dieter Holz
 */
public class Family {

    private final ArrayList<Person> members = new ArrayList<>();
    public int size() {
        return members.size();
    }

    public void add(Person person) {
        if (isMember(person)) {         ///wenn die Person bereits in der Familie enthalten ist, kann sie nicht mehr hinzugefügt werden
            return;
        }
        members.add(person);
    }

    public boolean isMember(Person person) {
        return members.contains(person);

    }

    public Person getOldest(){
        Person oldest = members.get(0);
        for(Person p : members){
            if(p.getAge() > oldest.getAge()){
                oldest = p;
            }
        }
        return oldest;
    }
}

