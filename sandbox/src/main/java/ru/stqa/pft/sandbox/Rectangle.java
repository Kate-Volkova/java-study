package ru.stqa.pft.sandbox;

public class Rectangle {

    public int b;
    public int c;

    public Rectangle (int b, int c) {
        this.b = b;
        this.c = c;
    }

    public int square () {
        return this.b * this.c;
    }
}
