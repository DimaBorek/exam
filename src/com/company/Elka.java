package com.company;

import java.security.PublicKey;
import java.util.List;

public class Elka {
    private String color;
    public Elka (String color){
        this.color = color;
    }
    public Elka(){
    }
    public String itIsColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getCountBlueBall(List<Elkaball> elkaballs){
        int result = 0;
        for (Elkaball i:elkaballs){
            if (i.getColor().equals("Blue")){
                result++;

            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elka elka = (Elka) o;

        return color != null ? color.equals(elka.color) : elka.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}
