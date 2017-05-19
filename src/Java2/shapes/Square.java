package Java2.shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("The area comes from the Square class");
        return super.getArea();
    }

    public double getPerimeter(){
        System.out.println("The Perimeter comes from the Square class");
        return super.getPerimeter();
    }


}
