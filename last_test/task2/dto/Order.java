package last_test.task2.dto;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderProduct> simpleProducts = new ArrayList<OrderProduct>();
    private DiscountCard discountCard;

    public void add(SimpleProduct product, int count) {
        simpleProducts.add(new OrderProduct(product, count));
    }

    public void addDiscount(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    private double calcDiscount(double sum, int discount){
        return sum * (discount * 1.0 / 100);
    }

    private double calcDiscount(double sum, DiscountCard discountCard){
        if(discountCard != null){
            return calcDiscount(sum, discountCard.getDiscount());
        }
        return 0;
    }

    public String getReceipt() {
        StringBuilder builder = new StringBuilder();
        int index = 0;

        for (OrderProduct simpleProduct : this.simpleProducts) {
            index++;
            builder.append(index)
                    .append(".")
                    .append(simpleProduct.toString())
                    .append("\n");

            double additionalDiscount =calcDiscount(simpleProduct.getSum(), this.discountCard);

            if(Double.compare(additionalDiscount, 0) > 0){
                builder.append("Дополнительная скидка по дисконтной карте: ")
                        .append(additionalDiscount)
                        .append("\n");
            }
        }
        return builder.toString();
    }

public double getSumForPay() {
        double sum = simpleProducts.stream()
                .mapToDouble(OrderProduct::getSum)
                .sum();
        return calcSumWithDiscount(sum, calcDiscount(sum, this.discountCard));
}

    private double calcSumWithDiscount(double sum, double discountSum){
        if(Double.compare(discountSum, 0) > 0){
            return sum - discountSum;
        }
        return sum;
    }
}
