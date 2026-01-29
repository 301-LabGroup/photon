package com.example.photon;

public abstract class Shape {
    public int x;
    public int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(int side) {
        this.x = side;
        this.y = side;
    }
}


