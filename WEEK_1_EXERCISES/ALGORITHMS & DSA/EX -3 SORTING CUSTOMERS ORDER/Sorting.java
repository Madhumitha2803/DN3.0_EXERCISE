public class Sorting {
   

        // Bubble Sort to sort orders by totalPrice
        public void bubbleSort(Order[] orders) {
            int n = orders.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                        // Swap orders[j] and orders[j + 1]
                        Order temp = orders[j];
                        orders[j] = orders[j + 1];
                        orders[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break; // If no elements were swapped, the array is sorted
            }
        
    }
    
    
}
