package pl.kfrak.databinding.models;

/**
 * Created by RENT on 2017-06-19.
 */

public class Beer {
    private String name;
    private float power;
    private float price;

    public Beer() {
    }

    public Beer(String name, float power, float price) {
        this.name = name;
        this.power = power;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}


