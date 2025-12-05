public class FastFoodRestaurant {
    public static void main(String[] args) {
        int[] prices = {200, 150, 300, 120, 250, 100, 180, 160};

        System.out.print("Item Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        int total = 0;
        for (int price : prices) {
            total += price;
        }
        System.out.println("Total Bill: " + total);
        int cheapest = prices[0];
        for (int price : prices) {
            if (price < cheapest) {
                cheapest = price;
            }
        }
        System.out.println("Cheapest Item: " + cheapest);
        int mostExpensive = prices[0];
        for (int price : prices) {
            if (price > mostExpensive) {
                mostExpensive = price;
            }
        }
        System.out.println("Most Expensive Item: " + mostExpensive);
    }
}
