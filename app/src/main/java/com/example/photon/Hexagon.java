package com.example.photon;

public class Hexagon extends Shape {
    private int width;
    private int height;

    public Hexagon(int x, int y, int width, int height) {
        super(x, y);  // Use position constructor from Shape
        this.width = width;
        this.height = height;
    }

    public Hexagon(int side) {
        super(side);  // Uses Shape's side constructor
        this.width = side;
        this.height = side;
    }
}
