package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, height: "
                + height + " units, firstParallel: "
                + upperBase + " units, secondParallel: "
                + lowerBase + " units, color: " + getColor());
    }
}
