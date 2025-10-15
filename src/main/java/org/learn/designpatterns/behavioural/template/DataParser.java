package org.learn.designpatterns.behavioural.template;

public abstract class DataParser {

    public void parseDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    public void readData() {
        System.out.println("Reading data from source");
    }

    public abstract void processData();

    public void writeData() {
        System.out.println("Writing data to destination");
    }
}
