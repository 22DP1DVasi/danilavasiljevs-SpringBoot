package rvt.exercises;

// class Employees for exercises with Enum and Iterators (Java Mooc)

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    private List<PersonEd> persons;

    public Employees(){
        this.persons = new ArrayList<PersonEd>();
    }

    public void add(PersonEd personToAdd){
        persons.add(personToAdd);
    }

    public void add(List<PersonEd> peopleToAdd){
        persons.addAll(peopleToAdd);
    }

    public void print(){
        Iterator<PersonEd> it = persons.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void print(Education education){
        Iterator<PersonEd> it = persons.iterator();
        while(it.hasNext()) {
            PersonEd i = it.next();
            if (i.GetEducationLevel() == education){
                System.out.println(i);
            }
        }
    }

    public void fire(Education education){
        Iterator<PersonEd> it = persons.iterator();
        while(it.hasNext()) {
            PersonEd i = it.next();
            if (i.GetEducationLevel() == education){
                it.remove();
            }
        }
    }

    public static void main(String[] args){
        Employees university = new Employees();
        university.add(new PersonEd("Petrus", Education.PHD));
        university.add(new PersonEd("Arto", Education.HS));
        university.add(new PersonEd("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }

}
