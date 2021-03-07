package oop2.module01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTest {
    @Test
    void testInit() {
        //given
        int    age    = 45;
        double weight = 90.0;
        double height = 1.75;

        //when
        Person p = new Person(age, weight, height);

        //then
        assertEquals(age   , p.getAge());
        assertEquals(height, p.getHeight());
        assertEquals(weight, p.getWeight());
        assertEquals(numberOfFriends, p.getNumberOfFriends());
    }

    @Test
    void testBMI() {
        //given
        Person p = new Person(45, 90.0, 1.75);

        //when
        double bmi = p.getBMI();

        //then
        assertEquals(29.4, bmi, 0.1);
    }

    @Test
    void testInitFriends() {
        //given
        Person p = new Person(45, 90.0, 1.75);

        //when
        int numberOfFriends = p.numberOfFriends();

        //then
        assertEquals(0, numberOfFriends);
    }

    @Test
    void testNewFriend(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);

        //when
        stuart.newFriend(kevin);

        //then
        assertEquals(1, stuart.numberOfFriends());
        assertEquals(1, kevin.numberOfFriends());
        assertTrue(stuart.hasAsFriend(kevin));
        assertTrue(kevin.hasAsFriend(stuart));
    }

    @Test
    void testAddFriendTwice(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);
        stuart.newFriend(kevin);

        //when
        stuart.newFriend(kevin);

        //then
        assertEquals(1, stuart.numberOfFriends());
        assertEquals(1, kevin.numberOfFriends());
        assertTrue(stuart.hasAsFriend(kevin));
        assertTrue(kevin.hasAsFriend(stuart));
    }

    @Test
    void testNotAFriendAnymore(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);
        stuart.newFriend(kevin);

        //when
        stuart.noFriend(kevin);

        //then
        assertEquals(0, stuart.numberOfFriends());
        assertEquals(0, kevin.numberOfFriends());
        assertFalse(stuart.hasAsFriend(kevin));
        assertFalse(kevin.hasAsFriend(stuart));
    }

}