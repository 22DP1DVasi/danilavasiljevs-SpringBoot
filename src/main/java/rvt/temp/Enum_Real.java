package rvt.temp;

/// Enum class - contains constant fields
public enum Enum_Real {
    ADD("this command adds student"),
    REMOVE("this command removes student"),
    SHOW("this command shows student");

    private String description;

    private Enum_Real(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
