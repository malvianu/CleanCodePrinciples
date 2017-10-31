package com.cleancode.coding.principles.exception.formatting;

public class HorizontalOpenness {

    private int lineCount;
    private int totalChars;

    public void measureLine(String line) {
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
        recordWidestLine(lineSize);
    }

    private void recordWidestLine(int lineSize){

    }
}
