package last_test.task2.dto;

public class StockProduct extends SimpleProduct{

    private int discount;

    public StockProduct(String name, double price, int discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.getName() + ", Цена - " + super.getPrice() + ", Скидка - " + discount + "%";
    }
}
