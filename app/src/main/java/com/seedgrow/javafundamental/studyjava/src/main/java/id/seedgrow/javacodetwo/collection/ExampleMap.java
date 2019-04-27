package com.seedgrow.javafundamental.studyjava.src.main.java.id.seedgrow.javacodetwo.collection;

class ExampleMap {
    private String name;
    private double mass;

    public ExampleMap(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString(){
        return "Planet " + name + ", mass : " + mass;
    }
}