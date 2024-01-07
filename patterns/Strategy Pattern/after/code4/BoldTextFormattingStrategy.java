public class BoldTextFormattingStrategy implements TextFormattingStrategy {

    public String format(String text) {
        return "Applying bold formatting: " + text;
    }
}