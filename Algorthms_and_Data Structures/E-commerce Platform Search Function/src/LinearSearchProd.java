
public class LinearSearchProd {
	  public static Product linearSearch(Product[] products, String targetId) {
	        for (Product product : products) {
	            if (product.getProductId().equals(targetId)) {
	                return product;
	            }
	        }
	        return null;
	    }

}
