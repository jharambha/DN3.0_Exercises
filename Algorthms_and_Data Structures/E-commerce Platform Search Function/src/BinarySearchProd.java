import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchProd {
    public static Product binarySearch(Product[] products, String targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
       
        Product[] products = {
            new Product("P003", "Product 3", "Category 1"),
            new Product("P001", "Product 1", "Category 2"),
            new Product("P002", "Product 2", "Category 1")
        };

       
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

     
        Product foundProduct = binarySearch(products, "P002");
        System.out.println(foundProduct != null ? foundProduct : "Product not found");
    }
}
