package rvt;

public class Money {

    private final int euros;
    private final int cents;

    // Constructor
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    // Second constructor / Constructor overloading
    public Money() {
        this.euros = 0;
        this.cents = 0;
    }

    // Third constructor
    public Money(int e) {
        this.euros = e;
        this.cents = 0;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "EUR";
    }

    public Money plus(Money addition) {   
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }

        Money newMoney = new Money(newEuros, newCents); 

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros < compared.euros) {  // m1EUR < m2EUR
            return true;
        } else if (this.euros == compared.euros) {      // m1EUR == m2EUR
            if (this.cents < compared.cents) {          // m1EUR == m2EUR and m1CEN < m2CEN
                return true;
            } else {                // m1EUR == m2EUR and m1CEN == m2CEN or m1CEN > m2CEN 
                return false;
            }                        
        } else {                // m1EUR > m2EUR
            return false;
        }
    }

    public Money minus(Money decreaser){
        int newEuros;
        int newCents;

        if (this.euros - decreaser.euros < 0) {     // if difference of euros is negative
            Money newMoney = new Money();
            return newMoney;
        }
        newEuros = this.euros - decreaser.euros;

        if (this.cents - decreaser.cents < 0) {     // if difference of cents is negative
            newEuros--;
            newCents = 100 - (decreaser.cents - this.cents);
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        }
        newCents = this.cents - decreaser.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;           
    }

    public static void main(String[] args) {
        System.out.println("First check.");
        Money macins1 = new Money(10, 40);
        Money macins2 = new Money(5, 70);

        Money macins3 = macins1.plus(macins2);


        System.out.println(macins1.toString());
        System.out.println(macins3.toString());
        System.out.println();

        System.out.println("Check plus.");
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        System.out.println();

        System.out.println("Check lessThan.");
        Money al = new Money(10, 0);
        Money bl = new Money(3, 0);
        Money cl = new Money(5, 0);

        System.out.println(al.lessThan(bl));  // false
        System.out.println(bl.lessThan(cl));  // true
        System.out.println();

        System.out.println("Check minus.");
        Money am = new Money(10, 0);
        Money bm = new Money(3, 50);

        Money cm = am.minus(bm);

        System.out.println(am);  // 10.00e
        System.out.println(bm);  // 3.50e
        System.out.println(cm);  // 6.50e

        cm = cm.minus(am);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(am);  // 10.00e
        System.out.println(bm);  // 3.50e
        System.out.println(cm);  // 0.00e
    }

}
