package mir.session.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBox extends Product {

    private List<Product> productList = new ArrayList<>();

    @Override
    float calculatePrice() {
        float sum = 0;
        for (Product p : productList) {
            sum += p.calculatePrice();
        }
        return sum;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }
}
