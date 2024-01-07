public class RectangleAdapter implements Rectangle {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }


    public double computeArea() {
        // Adapt the interface and call the calculateArea() method
        return legacyRectangle.calculateArea();
    }
}
