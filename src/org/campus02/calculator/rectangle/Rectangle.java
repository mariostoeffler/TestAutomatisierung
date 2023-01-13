package org.campus02.calculator.rectangle;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcScope() {
        int result = (a+b)*2;
        return result;
    }

    public int calcArea() {
        int result = a*b;
        return result;
    }
}
