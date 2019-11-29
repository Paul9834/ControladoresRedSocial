package com.example.controllersproyect.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Perfil {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("urlProfile")
    @Expose
    private String urlProfile;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("on_location")
    @Expose
    private Boolean onLocation;
    @SerializedName("gender_id")
    @Expose
    private Integer genderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getOnLocation() {
        return onLocation;
    }

    public void setOnLocation(Boolean onLocation) {
        this.onLocation = onLocation;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

}