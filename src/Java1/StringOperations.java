package Java1;

public class StringOperations {
    public static void main(String[] args) {
        String sentences = "This is some text";  // 1 string

        // String are immutable

        String sentenceCopy = "This is some text";

        sentences = sentences + " some more text" /* second string*/; // three strings

        System.out.println(sentences);

        sentenceCopy = null;  // the text can be garbage collected here
    }
}
