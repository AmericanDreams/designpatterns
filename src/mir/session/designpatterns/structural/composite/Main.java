package mir.session.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product = new Product1();
        printProductPrice(product);

        List<Product> productBox = new ArrayList<>();
        productBox.add(new Product1());
        productBox.add(new Product2());
        productBox.add(new Product1());


        /**
         * Ele bir funksionalliq temin etmeliyik ki , Product objectlerinin toplusuna da
         * Tek Product la reftar etditimiz kimi reftar ede bilek.
         * */
        //printProductPrice(productBox); ??

    }

    public static void printProductPrice(Product product) {
        System.out.println("Price is : " + product.calculatePrice());
    }
}
