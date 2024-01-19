package org.example.designpattern.structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("customFile.txt");

        image.display();
    }
}
