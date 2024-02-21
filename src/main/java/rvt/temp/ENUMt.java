package rvt.temp;

// work with Enum class
public class ENUMt {

    public static void Command(Enum_Real command){
        if (command == Enum_Real.ADD){
            System.out.println("This is command for:" + Enum_Real.ADD.getDescription());
        } else if (command == Enum_Real.REMOVE){
            System.out.println("This is command for:" + Enum_Real.REMOVE.getDescription());
        } else if (command == Enum_Real.SHOW){
            System.out.println("This is command for:" + Enum_Real.SHOW.getDescription());
        }
    }

    public static void main(String[] args){
        Command(Enum_Real.ADD);
        System.out.println(Enum_Real.REMOVE.ordinal()); // get field number
    }
}
