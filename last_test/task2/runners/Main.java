package last_test.task2.runners;

import last_test.task2.dto.DiscountCard;
import last_test.task2.dto.Market;
import last_test.task2.dto.Order;
import last_test.task2.dto.SimpleProduct;
import last_test.task2.dto.api.IMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IMarket shop = new Market();

        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int index = -1;

        boolean existProduct;

        do {
            System.out.println("Выберите товар");
            index = 1;
            for (SimpleProduct product : shop.getAllProducts()) {
                System.out.println(index++ + " - " + product.toString());
            }
            choice = scanner.nextInt();

            existProduct = choice < index && choice >= 1;

            if(existProduct){
                System.out.println("Введите количество ");
                int count = scanner.nextInt();
                order.add(shop.getProductByIndex(choice - 1), count);
            }
        } while (existProduct);

        order.addDiscount(new DiscountCard(3));

        System.out.println(order.getReceipt());
        System.out.println("Итого надо заплатить: " + String.format("%.2f", order.getSumForPay()));
    }
}
