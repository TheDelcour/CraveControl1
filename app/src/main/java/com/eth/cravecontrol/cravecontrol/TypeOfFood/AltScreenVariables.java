package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.databinding.BaseObservable;


/**
 * Created by Tobias on 12-04-2017.
 */

public class AltScreenVariables extends BaseObservable {
    //Variables for the unhealthy food
    private String calories;
    private String carbs;
    private String carbsSugar;
    private String fat;
    private String energy;
    private String info;
    private String type;
    //Variables for the healthy alternative
    private String typeAlt;
    private String infoAlt;
    private String caloriesAlt;
    private String carbsAlt;
    private String carbsSugarAlt;
    private String fatAlt;
    private String energyAlt;

    //the longest constructor in the world - used for the databinding with AltScreen
    public AltScreenVariables(String calories, String carbs, String carbsSugar, String fat, String energy, String info, String type, String typeAlt, String infoAlt, String caloriesAlt, String carbsAlt, String carbsSugarAlt, String fatAlt, String energyAlt) {
        this.calories = calories;
        this.carbs = carbs;
        this.carbsSugar = carbsSugar;
        this.fat = fat;
        this.energy = energy;
        this.info = info;
        this.type = type;
        this.typeAlt = typeAlt;
        this.infoAlt = infoAlt;
        this.caloriesAlt = caloriesAlt;
        this.carbsAlt = carbsAlt;
        this.carbsSugarAlt = carbsSugarAlt;
        this.fatAlt = fatAlt;
        this.energyAlt = energyAlt;
    }


    public String getInfoAlt() { return infoAlt; }

    public void setInfoAlt(String infoAlt) { this.infoAlt = infoAlt; }


    public String getTypeAlt() { return typeAlt; }

    public void setTypeAlt(String typeAlt) { this.typeAlt = typeAlt; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getCalories() { return calories; }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getCarbsSugar() {
        return carbsSugar;
    }

    public void setCarbsSugar(String carbsSugar) {
        this.carbsSugar = carbsSugar;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCaloriesAlt() {
        return caloriesAlt;
    }

    public void setCaloriesAlt(String caloriesAlt) {
        this.caloriesAlt = caloriesAlt;
    }

    public String getCarbsAlt() {
        return carbsAlt;
    }

    public void setCarbsAlt(String carbsAlt) {
        this.carbsAlt = carbsAlt;
    }

    public String getCarbsSugarAlt() {
        return carbsSugarAlt;
    }

    public void setCarbsSugarAlt(String carbsSugarAlt) {
        this.carbsSugarAlt = carbsSugarAlt;
    }

    public String getFatAlt() {
        return fatAlt;
    }

    public void setFatAlt(String fatAlt) {
        this.fatAlt = fatAlt;
    }

    public String getEnergyAlt() {
        return energyAlt;
    }

    public void setEnergyAlt(String energyAlt) {
        this.energyAlt = energyAlt;
    }
}
