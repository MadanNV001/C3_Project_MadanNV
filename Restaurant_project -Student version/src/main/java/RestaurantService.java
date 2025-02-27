import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    private List<Item> cart = new ArrayList<Item>();
    public Restaurant findRestaurantByName(String restaurantName){
        {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
        }
    }

    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }


    public Receipt totalCost(String itemName, double price, int quantity) {
        Receipt receipt= new Receipt(itemName,price,quantity);
        receipt.totalPrice += (price * quantity);
        return receipt;
    }
}
