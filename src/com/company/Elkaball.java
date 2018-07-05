package com.company;

public class Elkaball implements Comparable<Elkaball>{
    private String color;
    private int circle;
    public Elkaball(String color, int circle){
        this.color = color;
        this.circle = circle;
    }

    public String getColor() {
        return color;
    }

    public int getCircle() {
        return circle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    @Override
    public int compareTo(Elkaball o) {
        return color.compareTo(o.color);
    }
}
