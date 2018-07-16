package ru.job4j.profession;

public class Teacher extends Profession {
    public Teacher(String name) {
        super(name);
    }

    public Education lesson(Student student){
        Education teach = new Education();
        return teach.educationOf(student);
    }
}
