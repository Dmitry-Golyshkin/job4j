package ru.job4j.profession;

public class Profession {
    public String name;
    public String profession;

    public Profession(String name, String profession){
        this.name = name;
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }
    public String getName() {
        return this.name ;
    }
}