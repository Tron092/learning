package org.learn.designpatterns.behavioural.template;

public class TemplateDemo {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parseDataAndGenerateOutput();

        System.out.println();

        DataParser jsonParser = new JsonParser();
        jsonParser.parseDataAndGenerateOutput();
    }
}
