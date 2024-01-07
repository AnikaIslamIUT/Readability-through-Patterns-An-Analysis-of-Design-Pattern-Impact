public class TextEditor {

    private TextFormattingStrategy formattingStrategy;

    public TextEditor(TextFormattingStrategy formattingStrategy) {
        this.formattingStrategy = formattingStrategy;
    }

    public void setFormattingStrategy(TextFormattingStrategy formattingStrategy) {
        this.formattingStrategy = formattingStrategy;
    }

    public void formatText(String text) {
        // Delegate formatting to the selected strategy
        String formattedText = formattingStrategy.format(text);
        System.out.println(formattedText);
    }
}