package org.example.designpattern.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("Display " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Londing " + fileName + " from disk.");
    }
}
