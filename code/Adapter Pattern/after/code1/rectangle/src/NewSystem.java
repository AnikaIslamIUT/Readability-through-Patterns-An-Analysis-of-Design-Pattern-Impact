public class NewSystem {
    public void processRectangle(Rectangle rectangle) {
        // New system expects rectangles with a computeArea() method
        double area = rectangle.computeArea();
        // Process the area in the new system
        System.out.println("Area processed in the new system: " + area);
    }
}
