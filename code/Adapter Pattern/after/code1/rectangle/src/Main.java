public class Main {
    public static void main(String[] args) {
        // Creating an instance of LegacyRectangle
        LegacyRectangle legacyRectangle = new LegacyRectangle();

        // Creating an instance of RectangleAdapter, adapting LegacyRectangle to the new system
        Rectangle rectangleAdapter = new RectangleAdapter(legacyRectangle);

        // Using the adapted object in the new system
        NewSystem newSystem = new NewSystem();
        newSystem.processRectangle(rectangleAdapter);
    }
}
