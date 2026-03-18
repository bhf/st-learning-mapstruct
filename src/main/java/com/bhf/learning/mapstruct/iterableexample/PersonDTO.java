package com.bhf.learning.mapstruct.iterableexample;

import java.util.List;

public class PersonDTO {
    private String name;
    private List<ItemDTO> items;

    public PersonDTO() {
    }

    public PersonDTO(String name, List<ItemDTO> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }
}
