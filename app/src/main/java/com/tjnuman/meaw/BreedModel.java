package com.tjnuman.meaw;

public class BreedModel {

    private String name;
    private String origin;
    private String description;
    private String life_span;
    private String image;


    public BreedModel(String name, String origin, String description, String life_span, String image) {
        this.name = name;
        this.origin = origin;
        this.description = description;
        this.life_span = life_span;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
