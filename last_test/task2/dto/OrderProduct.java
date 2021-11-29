package last_test.task2.dto;

public class OrderProduct {

    private SimpleProduct product;
    private int countOfProduct;

    public OrderProduct(SimpleProduct product, int countOfProduct) {
        this.product = product;
        this.countOfProduct = countOfProduct;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public void setProduct(SimpleProduct product) {
        this.product = product;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public double getSum() {
        return product.getPrice() * countOfProduct;
    }

    @Override
    public String toString() {
        return product.toString() + ", Количество - " + countOfProduct + ", Сумма - " + String.format("%.2f", getSum());
    }
}
