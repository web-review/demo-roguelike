package com.company.service;

public class Map {
    private int height;
    private int weight;
    private char[][] array;
    private char symbol;

    public Map() { }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getSymbol() { return symbol; }

    public char[][] getArray() {
        return array;
    }

    public void init(int height, int weight, char symbol) {
        this.height = height;
        this.weight = weight;
        this.symbol = symbol;
        this.array = new char[height][weight];
    }

    public void setArray(char[][] array) {
        this.array = array;
    }
}
