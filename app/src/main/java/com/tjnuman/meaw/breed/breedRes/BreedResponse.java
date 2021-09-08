
package com.tjnuman.meaw.breed.breedRes;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BreedResponse implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("origin")
    @Expose
    private String origin;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("life_span")
    @Expose
    private String lifeSpan;

    @SerializedName("reference_image_id")
    @Expose
    private String referenceImageId;
    @SerializedName("image")
    @Expose
    private Image image;


    public BreedResponse(String name, String origin, String description, String lifeSpan, String referenceImageId, Image image) {

        this.name = name;
        this.origin = origin;
        this.description = description;
        this.lifeSpan = lifeSpan;
        this.referenceImageId = referenceImageId;
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

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }


    public String getReferenceImageId() {
        return referenceImageId;
    }

    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
