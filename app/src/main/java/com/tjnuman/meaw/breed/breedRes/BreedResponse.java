
package com.tjnuman.meaw.breed.breedRes;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BreedResponse implements Serializable
{

    @SerializedName("name")
    @Expose
    private java.lang.String name;

    @SerializedName("origin")
    @Expose
    private java.lang.String origin;

    @SerializedName("description")
    @Expose
    private java.lang.String description;

    @SerializedName("life_span")
    @Expose
    private java.lang.String lifeSpan;

    @SerializedName("image")
    @Expose
    private String image;


//    public BreedResponse(java.lang.String name, java.lang.String origin, java.lang.String lifeSpan , java.lang.String description) {
//
//        this.name = name;
//        this.origin = origin;
//        this.description = description;
//        this.lifeSpan = lifeSpan;
//
//
//    }


    public BreedResponse(java.lang.String name, java.lang.String origin, java.lang.String lifeSpan, java.lang.String description, String image) {
        this.name = name;
        this.origin = origin;
        this.description = description;
        this.lifeSpan = lifeSpan;
        this.image = image;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getOrigin() {
        return origin;
    }

    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(java.lang.String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
