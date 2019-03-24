import java.util.Scanner;

public class ExVENCI1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuffer buffer = new StringBuffer();

        for (char ch : text.toCharArray()) {
            if (Character.isLowerCase(ch)){
                buffer.append(Character.toUpperCase(ch));
            }else if (Character.isUpperCase(ch)){
                buffer.append(Character.toLowerCase(ch));
            }else if (Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                num *= 2;
                buffer.append(num);
            }else if (ch == '!' || ch == '.' ||ch == '?') {
                buffer.append(".");
            }
        }
        buffer.reverse();
        System.out.println(buffer.toString());
    }
}
