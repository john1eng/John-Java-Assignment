package com.revature.rectangleJan5;

//Define a rectangle class and its application with all possible operations
public class Rectangle {
    private int width;
    private int height;

    public int area(){
        return width * height;
    }
    public int parameter(){
        return 2*(width+height);
    }

    public void setValue(int w, int h){
        width = w;
        height = h;
    }

    public String toString(){
        return "Rectangle [width = " + width + ", height = " + height + "]";
    }
}
