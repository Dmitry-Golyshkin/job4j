package ru.job4j.profession;

public class Engineer extends Profession {
    public Build building(House house) {
        Build build = new Build();
        return build.buildingOf(house);
    }
}
