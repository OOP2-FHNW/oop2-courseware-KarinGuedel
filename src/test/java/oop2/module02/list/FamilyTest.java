package oop2.module02.list;

import org.junit.jupiter.api.Test;

import oop2.module02.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@author Dieter Holz

class FamilyTest {

  @Test
    void testInitialSize() {
        //given
        Family family = new Family();

        //when
        int size = family.size();
        //then
        assertEquals(0, size);
    }

    @Test
    void testSize() {
        //given
        Family family = new Family();
        Person p1 = new Person(30, 50, 1.70);
        Person p2 = new Person (20,40, 1.60);
        family.add(p1);
        family.add(p2);

        //when
        int size = family.size();
       //then
        assertEquals(2, size);
    }

    @Test
    void testAdd() {
        //given
        Family family = new Family();
        Person p1 = new Person(30, 50, 1.70);

        //when
        family.add(p1);

        //then
        assertTrue(family.isMember(p1));
        assertFalse(family.isMember(new Person(35, 45, 1.60)));
    }

    @Test
    void testFamilyGrows() {
        //given
        Family family  = new Family();
        Person p1 = new Person(30, 50, 1.70);
        Person p2 = new Person(35, 45, 1.60);
        Person p3 = new Person (80, 45, 1.30);

        family.add(p1);
        family.add(p2);

        //when
        family.add(p3);

        //then
        assertTrue(family.isMember(p1));
        assertTrue(family.isMember(p2));
        assertTrue(family.isMember(p3));
    }

    @Test
    void testAddPersonTwice() {
        //given
        Family family  = new Family();
        Person personA = new Person(30, 50, 1.70);
        family.add(personA);

        //when
        family.add(personA);
        System.out.println(getClass().toString());

        //then
        assertEquals(1, family.size());
    }

    @Test
    void testGetOldest() {
        //given
        Family family  = new Family();
        Person p1 = new Person(30, 50, 1.70);
        Person p2 = new Person(35, 45, 1.60);
        Person p3 = new Person (80, 45, 1.30);
        family.add(p1);
        family.add(p2);
        family.add(p3);

        //when
        Person oldest = family.getOldest();
        System.out.println(oldest.getAge());
        //then
        assertSame(p3, oldest);
    }
}