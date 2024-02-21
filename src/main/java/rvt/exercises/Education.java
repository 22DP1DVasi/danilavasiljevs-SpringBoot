package rvt.exercises;

public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String description;

    private Education(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
