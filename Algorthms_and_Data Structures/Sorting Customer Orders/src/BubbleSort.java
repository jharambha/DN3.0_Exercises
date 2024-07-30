public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                   
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
      
        Order[] orders = {
            new Order("O003", "Customer 3", 150.0),
            new Order("O001", "Customer 1", 100.0),
            new Order("O002", "Customer 2", 200.0)
        };

       
        bubbleSort(orders);

      
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
