public class ItalicTextFormattingStrategy implements TextFormattingStrategy {
    @Override
    public String format(String text) {
        return "Applying italic formatting: " + text;
    }
}