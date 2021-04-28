package Java_Base.继承性;

public class Cylinder extends Circle {
    private double height;

    @Override
    public double getArea() {
        return 12.00;
    }

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {

        return this.getArea() * this.height;
    }



}
