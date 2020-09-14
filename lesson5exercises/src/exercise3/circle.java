package exercise3;

public class circle {
    private int radius;
    private int diameter;
    private double area;

public circle(){
    this.radius = 1;
    this.diameter = radius * 2;
    this.area = Math.PI * Math.pow(radius, 2);
}

public void setRadius(int radius){
    this.radius = radius;
    this.diameter = radius * 2;
    this.area = Math.PI * (radius* 2);

}

    public int getRadius() {
        return radius;
    }
    public String toString(){
    return "\tRadius is " + radius+
            "\n\tDiameter is " + diameter +
            "\n\tArea is " + area;
    }
}
