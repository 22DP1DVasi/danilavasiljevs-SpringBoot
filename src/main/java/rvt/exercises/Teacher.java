package rvt.exercises;

public class Teacher extends Person {

    private int salary;

    public Teacher(String Name, String Address, int Salary){
        super(Name, Address);
        this.salary = Salary;
    }

    public int salary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "  " + "salary " + this.salary + " euro/month";
    }

    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
        ollie.study();
        i = i + 1;
        }
        System.out.println(ollie);
    }

}
