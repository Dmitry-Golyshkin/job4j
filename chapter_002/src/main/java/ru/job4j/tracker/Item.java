package ru.job4j.tracker;

import java.util.*;

public class Item {
    private String name;
    private String id;
    private String description;
    private long created;
    private String[] comments;

    public Item(String name, String description,long created){
        this.name = name;
        this.description = description;
        this.created = created;
    }

    public Item(String test_name, String description) {
        this.name = test_name;
        this.description = description;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
