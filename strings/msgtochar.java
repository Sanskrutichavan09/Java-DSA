package strings;
public class msgtochar {
    public static void main(String[] args) {
        // Convert message to char array

        String message = "Sanskruti";
        char[] printchar = message.toCharArray(); // Use toCharArray() method

        for (int i = 0; i < printchar.length; i++) {
            System.out.println("Index: " + i + "  PrintChar: " + printchar[i]);
        }
    }
}
