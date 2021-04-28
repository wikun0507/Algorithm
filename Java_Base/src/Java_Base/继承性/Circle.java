package Java_Base.继承性;

public class Circle {
    private double radius;

    public Circle() {
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
