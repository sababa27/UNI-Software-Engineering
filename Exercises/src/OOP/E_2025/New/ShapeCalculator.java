package OOP.E_2025.New;

public class ShapeCalculator {
    public void calculateAndPrintVolume(Figure figure) {
        System.out.println(figure.figureToString());
    }

    public static void main(String[] args) {
        OOP.E_2025.Old.ShapeCalculator sc = new OOP.E_2025.Old.ShapeCalculator();

        sc.calculateAndPrintVolume("sphere", 5, 0);
        sc.calculateAndPrintVolume("cube", 3, 0);
        sc.calculateAndPrintVolume("cylinder", 2, 10);
    }
}
