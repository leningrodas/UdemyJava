package classes;

import java.util.Locale;

public class car {
    private int doors;
    private String model;
    private int miles;
    private int wheels;
    private String Engine;
    private String color;
    private String interiorType;


    public String getModel() {
        return model;
    }
//    this is the skeleton of a setter without validation
    public void setModel(String model){
    this.model = model;
    }

//to set validation is to add testing to allow to make sure it is correct.
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if(validModel.equals("porchse") || validModel.equals("fourrunner")){
//            this.model=model;
//        } else {
//        this.model = "incorrect model";
//
//    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }
}
