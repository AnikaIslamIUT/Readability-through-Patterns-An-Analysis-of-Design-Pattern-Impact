// SimpleTextEditor class without strategy pattern
public class SimpleTextEditor {

    private String text;

    public SimpleTextEditor(String text) {
        this.text = text;
    }

    public void formatText(String formatType) {
        if ("bold".equals(formatType)) {
            // Logic for applying bold formatting
            System.out.println("Applying bold formatting: " + text);
        } else if ("italic".equals(formatType)) {
            // Logic for applying italic formatting
            System.out.println("Applying italic formatting: " + text);
        } else {
            // Default case (no formatting)
            System.out.println("No formatting applied: " + text);
        }
    }
}
