package org.example.designpattern.creation.builder;

public class Application {

    public static void main(String[] args) {

// this an example of using builder design pattern
        //Instead of creating an instance of a class in a constructor (somme times we have a constructor with many parameter)
        new Circle(5L, 6L, "Red").draw();

        // we can use the builder design pattern like this : (this will be more readable and easy to recognise  each parameter in the Circle instance created
        new Circle.Builder()
                .withRadian(5L)
                .withSurface(6L)
                .withColor("Red")
                .build().draw(); //(in this case we can avoid )
    }
}
