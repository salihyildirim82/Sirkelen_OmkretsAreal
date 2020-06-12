package com.company;

public class Sirkel {
    private int radius ;
    private double pi;
    public Sirkel(int yaricap, int radius) {
        this.radius = radius;
        this.pi=Math.PI;
    }

    public double getOmkrets(){
        return 2*pi*this.radius;
    }

    public double getAreal(){
        return pi*this.radius*this.radius;
    }
}
