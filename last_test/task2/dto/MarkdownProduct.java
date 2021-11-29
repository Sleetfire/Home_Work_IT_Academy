package last_test.task2.dto;

public class MarkdownProduct extends StockProduct {

    private String discountReason;

    public String getDiscountReason() {
        return discountReason;
    }

    public MarkdownProduct(String name, double price, int discount, String discountReason) {
        super(name, price, discount);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getDiscount() {
        return super.getDiscount();
    }

    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }

    @Override
    public String toString() {
        return super.getName() + ", Уценка - " + this.discountReason + ", Цена - " + super.getPrice() + ", Скидка - " +
                super.getDiscount() + "%";
    }
}
