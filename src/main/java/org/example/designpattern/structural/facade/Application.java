package org.example.designpattern.structural.facade;

import org.example.designpattern.creation.builder.Circle;

public class Application {

    public static  void main(String[] args) {
        // this an example of using facade design pattern
        //Instead of using the standard class Circle or Rectangle or Square like this :
        new Rectangle().draw();
        new Square().draw();

        //we use the facade pattern like this :
        ShapeMaker shapeMaker = new ShapeMaker();
        //here we show how to use shapeMaker instance to realise the job of Circle, Rectangle and Square,
        // so we pass from complex set of class (Circle, rectangle, square) to single class shapeMaker
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
