package hilell.l10.company;

public class TextService {

    private final int MIN_WORD_LENGTH = 3;

    public void checkText(String text) {

        if (validateText(text)) {
            System.out.println();
        }

    }

    public void checkTextUSA(String text) {

        System.out.println();

    }

    public void checkTextChina(String text) {

        System.out.println();

    }

    public static void foo() {
        System.out.println("foo");
    }

    private boolean validateText(String text) {
        return text.length() > MIN_WORD_LENGTH;
    }


}
