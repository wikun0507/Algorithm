package Java_Base.继承性;

import java.text.DecimalFormat;

public class TestExtend {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5);
        DecimalFormat df =  new DecimalFormat(  "0.00 " );
        cylinder.setRadius(3);
        System.out.println(df.format(cylinder.getArea())+" "+ df.format(cylinder.getVolumn()));
    }
}
