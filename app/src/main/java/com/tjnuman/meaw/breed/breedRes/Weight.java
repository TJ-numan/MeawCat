
package com.tjnuman.meaw.breed.breedRes;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Weight implements Serializable
{

    @SerializedName("imperial")
    @Expose
    private String imperial;
    @SerializedName("metric")
    @Expose
    private String metric;
    private final static long serialVersionUID = -2393945292674311932L;

    public String getImperial() {
        return imperial;
    }

    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

}
