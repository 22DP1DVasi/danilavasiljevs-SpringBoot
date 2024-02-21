package rvt.exercises;

// class Person for exercises with Enum and Iterators (Java Mooc)

public class PersonEd {

    private String name;
    private Education educationLevel;

    public PersonEd(String Name, Education education){
        this.name = Name;
        this.educationLevel = education;
    }

    public String getName(){
        return this.name;
    }

    public Education GetEducationLevel(){
        return this.educationLevel;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.educationLevel;
    }

    public static void main(String[] args) {
        PersonEd ada = new PersonEd("Anna", Education.PHD);
        System.out.println(ada);
    }
}

