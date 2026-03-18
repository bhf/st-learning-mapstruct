package com.bhf.learning.mapstruct.iterableexample;

public class PersonEntity {
    private String name;
    private Iterable<Item> items;

    public PersonEntity() {
    }

    public PersonEntity(String name, Iterable<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iterable<Item> getItems() {
        return items;
    }

    public void setItems(Iterable<Item> items) {
        this.items = items;
    }
}
