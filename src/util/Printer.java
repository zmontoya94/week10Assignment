package util;

public class Printer {

    private static Integer horizontalDividerLength = 30;

    private Printer() { }

    public static void printTitle(String title) {
        int marginLength = (horizontalDividerLength - title.length()) / 2;
        StringBuilder stringBuilder = build(" ", marginLength);

        printHorizontalDivider();
        System.out.println(stringBuilder.toString() + " " + title.toUpperCase() + " " + stringBuilder.reverse().toString());
        printHorizontalDivider();
    }

    public static void printInstructions(String instructions) {
        System.out.print("--> " + instructions + " <--\n");
    }

    public static void printOption(String option, int optionNumber) {
        System.out.println( optionNumber + ") " + option);
    }

    public static void printResponse(String response) {
        System.out.println(response);
    }

    public static void printAlert(String alert) {
        System.out.println("!!!!" + alert + "!!!!");
    }

    private static void printHorizontalDivider() {
        StringBuilder stringBuilder = build("*", horizontalDividerLength);
        System.out.println(stringBuilder.toString());
    }

    public static void printSectionEnd() {
        StringBuilder stringBuilder = build("^", horizontalDividerLength);
        System.out.println(stringBuilder.toString());
    }

    private static StringBuilder build(String string, int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder;
    }

}
