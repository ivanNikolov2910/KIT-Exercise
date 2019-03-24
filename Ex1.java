import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wines = 300;
        int beers = 200;
        int wineDelivery = 0;
        int wineOrder = 0;
        int beerDelivery = 0;
        int beerOrder = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            String[] strings = input.split(": ");
            String drink = strings[0];
            int quantity = Integer.parseInt(strings[1]);
            if (quantity == 0){
                continue;
            }
            if (drink.equals("Beers") && (beers + quantity >= 0)) {
                if (quantity > 0) {
                    beers += quantity;
                    beerDelivery++;
                } else if (quantity < 0) {
                    beers += quantity;
                    beerOrder++;
                }
            } else if (drink.equals("Wines") && (wines + quantity >= 0)) {
                if (quantity > 0) {
                    wines += quantity;
                    wineDelivery++;
                } else if (quantity < 0) {
                    wines += quantity;
                    wineOrder++;
                }
            }
        }
        System.out.println("Wines: " + wines);
        System.out.println("Deliveries: " + wineDelivery);
        System.out.println("Orders: " + wineOrder);
        System.out.println("Beers: " + beers);
        System.out.println("Deliveries: " + beerDelivery);
        System.out.println("Orders: " + beerOrder);

    }
}
