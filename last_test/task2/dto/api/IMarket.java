package last_test.task2.dto.api;

import last_test.task2.dto.SimpleProduct;

import java.util.List;

public interface IMarket {

    /**
     * Метод, который возвращает список всех продуктов
     *
     * @return список всех продуктов
     */
    List<SimpleProduct> getAllProducts();

    /**
     * Метод, который возвращает продукт из списка по индексу
     *
     * @param index индекс продукта
     * @return продукт
     */
    SimpleProduct getProductByIndex(int index);
}
