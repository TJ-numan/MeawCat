
package com.tjnuman.meaw.breed.breedRes;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BreedResponse implements Serializable
{

    @SerializedName("weight")
    @Expose
    private int weight;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cfa_url")
    @Expose
    private String cfaUrl;
    @SerializedName("vetstreet_url")
    @Expose
    private String vetstreetUrl;
    @SerializedName("vcahospitals_url")
    @Expose
    private String vcahospitalsUrl;
    @SerializedName("temperament")
    @Expose
    private String temperament;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("country_codes")
    @Expose
    private String countryCodes;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("life_span")
    @Expose
    private String lifeSpan;
    @SerializedName("indoor")
    @Expose
    private Integer indoor;
    @SerializedName("lap")
    @Expose
    private Integer lap;
    @SerializedName("alt_names")
    @Expose
    private String altNames;
    @SerializedName("adaptability")
    @Expose
    private Integer adaptability;
    @SerializedName("affection_level")
    @Expose
    private Integer affectionLevel;
    @SerializedName("child_friendly")
    @Expose
    private Integer childFriendly;
    @SerializedName("dog_friendly")
    @Expose
    private Integer dogFriendly;
    @SerializedName("energy_level")
    @Expose
    private Integer energyLevel;
    @SerializedName("grooming")
    @Expose
    private Integer grooming;
    @SerializedName("health_issues")
    @Expose
    private Integer healthIssues;
    @SerializedName("intelligence")
    @Expose
    private Integer intelligence;
    @SerializedName("shedding_level")
    @Expose
    private Integer sheddingLevel;
    @SerializedName("social_needs")
    @Expose
    private Integer socialNeeds;
    @SerializedName("stranger_friendly")
    @Expose
    private Integer strangerFriendly;
    @SerializedName("vocalisation")
    @Expose
    private Integer vocalisation;
    @SerializedName("experimental")
    @Expose
    private Integer experimental;
    @SerializedName("hairless")
    @Expose
    private Integer hairless;
    @SerializedName("natural")
    @Expose
    private Integer natural;
    @SerializedName("rare")
    @Expose
    private Integer rare;
    @SerializedName("rex")
    @Expose
    private Integer rex;
    @SerializedName("suppressed_tail")
    @Expose
    private Integer suppressedTail;
    @SerializedName("short_legs")
    @Expose
    private Integer shortLegs;
    @SerializedName("wikipedia_url")
    @Expose
    private String wikipediaUrl;
    @SerializedName("hypoallergenic")
    @Expose
    private Integer hypoallergenic;
    @SerializedName("reference_image_id")
    @Expose
    private String referenceImageId;
    @SerializedName("image")
    @Expose
    private String image;


    public BreedResponse(int weight, String id, String name, String cfaUrl, String vetstreetUrl, String vcahospitalsUrl, String temperament, String origin, String countryCodes, String countryCode, String description, String lifeSpan, Integer indoor, Integer lap, String altNames, Integer adaptability, Integer affectionLevel, Integer childFriendly, Integer dogFriendly, Integer energyLevel, Integer grooming, Integer healthIssues, Integer intelligence, Integer sheddingLevel, Integer socialNeeds, Integer strangerFriendly, Integer vocalisation, Integer experimental, Integer hairless, Integer natural, Integer rare, Integer rex, Integer suppressedTail, Integer shortLegs, String wikipediaUrl, Integer hypoallergenic, String referenceImageId, String image) {
        this.weight = weight;
        this.id = id;
        this.name = name;
        this.cfaUrl = cfaUrl;
        this.vetstreetUrl = vetstreetUrl;
        this.vcahospitalsUrl = vcahospitalsUrl;
        this.temperament = temperament;
        this.origin = origin;
        this.countryCodes = countryCodes;
        this.countryCode = countryCode;
        this.description = description;
        this.lifeSpan = lifeSpan;
        this.indoor = indoor;
        this.lap = lap;
        this.altNames = altNames;
        this.adaptability = adaptability;
        this.affectionLevel = affectionLevel;
        this.childFriendly = childFriendly;
        this.dogFriendly = dogFriendly;
        this.energyLevel = energyLevel;
        this.grooming = grooming;
        this.healthIssues = healthIssues;
        this.intelligence = intelligence;
        this.sheddingLevel = sheddingLevel;
        this.socialNeeds = socialNeeds;
        this.strangerFriendly = strangerFriendly;
        this.vocalisation = vocalisation;
        this.experimental = experimental;
        this.hairless = hairless;
        this.natural = natural;
        this.rare = rare;
        this.rex = rex;
        this.suppressedTail = suppressedTail;
        this.shortLegs = shortLegs;
        this.wikipediaUrl = wikipediaUrl;
        this.hypoallergenic = hypoallergenic;
        this.referenceImageId = referenceImageId;
        this.image = image;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCfaUrl() {
        return cfaUrl;
    }

    public void setCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
    }

    public String getVetstreetUrl() {
        return vetstreetUrl;
    }

    public void setVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
    }

    public String getVcahospitalsUrl() {
        return vcahospitalsUrl;
    }

    public void setVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public Integer getIndoor() {
        return indoor;
    }

    public void setIndoor(Integer indoor) {
        this.indoor = indoor;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public Integer getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(Integer adaptability) {
        this.adaptability = adaptability;
    }

    public Integer getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(Integer affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    public Integer getChildFriendly() {
        return childFriendly;
    }

    public void setChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
    }

    public Integer getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getGrooming() {
        return grooming;
    }

    public void setGrooming(Integer grooming) {
        this.grooming = grooming;
    }

    public Integer getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(Integer healthIssues) {
        this.healthIssues = healthIssues;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getSheddingLevel() {
        return sheddingLevel;
    }

    public void setSheddingLevel(Integer sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
    }

    public Integer getSocialNeeds() {
        return socialNeeds;
    }

    public void setSocialNeeds(Integer socialNeeds) {
        this.socialNeeds = socialNeeds;
    }

    public Integer getStrangerFriendly() {
        return strangerFriendly;
    }

    public void setStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    public Integer getVocalisation() {
        return vocalisation;
    }

    public void setVocalisation(Integer vocalisation) {
        this.vocalisation = vocalisation;
    }

    public Integer getExperimental() {
        return experimental;
    }

    public void setExperimental(Integer experimental) {
        this.experimental = experimental;
    }

    public Integer getHairless() {
        return hairless;
    }

    public void setHairless(Integer hairless) {
        this.hairless = hairless;
    }

    public Integer getNatural() {
        return natural;
    }

    public void setNatural(Integer natural) {
        this.natural = natural;
    }

    public Integer getRare() {
        return rare;
    }

    public void setRare(Integer rare) {
        this.rare = rare;
    }

    public Integer getRex() {
        return rex;
    }

    public void setRex(Integer rex) {
        this.rex = rex;
    }

    public Integer getSuppressedTail() {
        return suppressedTail;
    }

    public void setSuppressedTail(Integer suppressedTail) {
        this.suppressedTail = suppressedTail;
    }

    public Integer getShortLegs() {
        return shortLegs;
    }

    public void setShortLegs(Integer shortLegs) {
        this.shortLegs = shortLegs;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    public Integer getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(Integer hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public String getReferenceImageId() {
        return referenceImageId;
    }

    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
