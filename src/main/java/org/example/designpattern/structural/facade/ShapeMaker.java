package org.example.designpattern.structural.facade;

import org.example.designpattern.creation.builder.Circle;

public class ShapeMaker {
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}