/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package Java2.shapes;

abstract public class Quadralateral  extends Shape {
    protected double length;
    protected double width;

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract public void setLength(double length);

    abstract public void setWidth(double width);
}
