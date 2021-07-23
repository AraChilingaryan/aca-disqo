package com.aca.disqo;

import com.aca.disqo.util.sortlist.Person;
import com.aca.disqo.util.sortlist.SortingUtilCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person person = new Person("kasyan",11);
        Person person1 = new Person("armen", 11);
        people.add(person);
        people.add(person1);
        System.out.println(people);
        SortingUtilCollection.quickSort(people);
        System.out.println(people);

    }
}
