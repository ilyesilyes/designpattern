package org.example.designpattern.creation.builder;

import org.example.designpattern.structural.facade.Shape;

public class Circle implements Shape {
    private Long radian;
    private Long surface;
    private String color;

    public Circle(Long radian, Long surface, String color) { // here the constructor have only one parameter but sometimes we have a constructor with many parameter
        this.radian = radian;
        this.surface = surface;
        this.color = color;

    }

    public Long getRadian() {
        return radian;
    }

    public void setRadian(Long radian) {
        this.radian = radian;
    }

    public Long getSurface() {
        return surface;
    }

    public void setSurface(Long surface) {
        this.surface = surface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

    public static class Builder {
        private Long radian;
        private String color;

        public Builder withSurface(Long surface) {
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withRadian(Long radian) {
            this.radian = radian;
            return this;
        }


        public Circle build() {
            Circle c =  new Circle(5L, 6L, "blue");
            c.setRadian(this.radian);
            return c;
        }
    }
}