package Exercise10;

public class Circle
{
    private int Radius;


    public void setRadius(int radius)
    { this.Radius = radius; }

    public int getRadius()
    { return this.Radius; }

    public double circumference()
    { return 2 * Math.PI * Radius; }

    public double diameter()
    { return  Radius * 2; }
}
