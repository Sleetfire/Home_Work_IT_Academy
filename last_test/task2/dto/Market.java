package last_test.task2.dto;

import last_test.task2.dto.api.IMarket;

import java.util.ArrayList;
import java.util.List;

public class Market implements IMarket {

    List<SimpleProduct> productList = new ArrayList<>();

    @Override
    public List<SimpleProduct> getAllProducts() {
        productList.add(new SimpleProduct("Молоко", 2.35));
        productList.add(new StockProduct("Телевизор", 8363, 31));
        productList.add(new MarkdownProduct("Бананы",10, 50, "Битые"));
        return productList;
    }

    @Override
    public SimpleProduct getProductByIndex(int index) {
        return getAllProducts().get(index);
    }
}
