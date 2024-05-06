import java.util.Arrays;

public class Main {
    static String reverseString(String s) {

        String[] arrOfStr = s.trim().split("\\s+");
        for (int i =0 ; i< arrOfStr.length /2; i++) {
            String temp = arrOfStr[i];
            arrOfStr[i] = arrOfStr[arrOfStr.length -1-i];
            arrOfStr[arrOfStr.length -1-i] = temp;
        }
        return String.join(" ", arrOfStr);
    }

    public static void main(String[] args) {
        String originalString = "a good   example";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }
}