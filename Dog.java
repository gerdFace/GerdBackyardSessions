package com.gerdface.session1;

public class Dog {

    private String name;
    private static double weight;
//    I had to make this field static
    private static boolean hasPoopedRecently;
//    I had to make this field static

    public Dog(String name, double weight, boolean hasPoopedRecently) {
        this.name = name;
        this.weight = weight;
        this.hasPoopedRecently = hasPoopedRecently;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public double getWeight() {
        return weight;
        This was a duplicate method
    }*/

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static boolean hasPoopedRecently() {
        return hasPoopedRecently;
    }

    public void setHasPoopedRecently(boolean hasPoopedRecently) {
        this.hasPoopedRecently = hasPoopedRecently;
    }

    public static double getWeight() {
        if(hasPoopedRecently) {
            return  weight - 5.0;
        } else {
            return weight;
        }
    }
}
