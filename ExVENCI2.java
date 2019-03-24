import java.util.Scanner;

public class ExVENCI2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.matches("^[0-9]{5}\\?.*![a-z]{3}$")) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }

//    public static boolean isValid(String text) {
//        for (int i = 0; i < 5; i++) {
//            if (!Character.isDigit(text.charAt(i))) {
//                return false;
//            }
//        }
//        if (text.charAt(5) != '?') {
//            return false;
//        }
//        if (!Character.isLetter(text.length() - 1)
//                || !Character.isLetter(text.length() - 2)
//                || !Character.isLetter(text.length() - 3)
//                || text.charAt(text.length() - 4) != '!') { return false; }
//        return true;
//    }
}
