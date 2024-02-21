package rvt.temp;

public class JavaMooc {
    public static void RegexUzd1(String number){
        if (number.matches("01[0-9]{7}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
    }

    
    public static void RegexUzd2(String number){
        if (number.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }
    }

    public static void main(String[] args){
        RegexUzd1("0123456");
        RegexUzd2("111");
    }
}
