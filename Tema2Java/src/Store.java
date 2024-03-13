import java.util.List;
import java.util.ArrayList;
public class Store {
    private String storeName;
    private String location;

    private int numEmployees;
    private float rating;
    private List<FoodItem> inventory;

    public Store(String storeName, String location, int numEmployees, float rating) {
        this.storeName = storeName;
        this.location = location;
        this.numEmployees = numEmployees;
        this.rating = rating;
        this.inventory = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public float getRating() {
        return rating;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float AverageRatingEmployee(){
        if(numEmployees==0){
            return 0;
        }
        return rating/numEmployees;
    }
    public FoodItem SearchFoodName(String name){
        for (FoodItem item : inventory){
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "StoreClass{" +
                "storeName='" + storeName + '\'' +
                ", location='" + location + '\'' +
                ", numEmployees=" + numEmployees +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;

        Store that = (Store) o;

        if (numEmployees != that.numEmployees) return false;
        if (Float.compare(that.rating, rating) != 0) return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;
        return location != null ? location.equals(that.location) : that.location == null;
    }

    @Override
    public int hashCode() {
        int result = getStoreName() != null ? getStoreName().hashCode() : 0;
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + getNumEmployees();
        result = 31 * result + (getRating() != 0.0f ? Float.floatToIntBits(getRating()) : 0);
        return result;
    }
    public void addItem(FoodItem foodItem) {
        inventory.add(foodItem);
    }

}
