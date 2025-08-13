package OOP.E_2025.New;

public class Cylinder implements Figure{
    private final int radius;
    private final int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String figureToString(){
        return "Shape: Cylinder, Volume: " + volume();
    }
}
