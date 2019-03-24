import java.util.ArrayList;
import java.util.Scanner;

public class Commands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        while (true) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("print")) {
                break;
            } else if (command[0].equals("push")) {
                int num = Integer.parseInt(command[1]);
                numbers.add(num);
            } else if (command[0].equals("pop")) {
                System.out.println(numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            } else if (command[0].equals("shift")) {
                int temp = numbers.get(0);
                numbers.set(0,numbers.get(numbers.size() - 1));
                numbers.set(numbers.size() - 1, temp);
            }
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
