enum FoodType {
    Fruit,
    Vegetable,
    Protein,
    Grain,
    Dairy,
    Bakery,
    Other

}

public class FoodItem implements Comparable<FoodItem> {

    private final String name;
    private final FoodType type;
    private final float calories;
    private final int weight;

    public FoodItem(String name, FoodType type, float calories, int weight) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public FoodType getType() {
        return type;
    }

    public float getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public int compareTo(FoodItem other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
