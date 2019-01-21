/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Kareem.Kamel
 */
class Rectangle {
    protected int w;
    protected int h;

    public void setWidth(int width) {
        w = width;
    }

    public void setHeight(int height) {
        h = height;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public int getArea() {
        return w * h;
    }
}
class Square extends Rectangle {
    public void setWidth(int width) {
        w = width;
        h = width;
    }

    public void setHeight(int height) {
        w = height;
        h = height;
    }

}