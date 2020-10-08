package J3_L1_hw_semenov;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
        this.fruits = new ArrayList<>();

    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T addFruit : fruits) {
            weight = weight + addFruit.getWeight();
        }
        return weight;
    }

    public void emptyFruit(Box<T> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    @Override
    public int compareTo(Box<? extends Fruit> box) {
        if (fruits.size() < box.getFruits().size()) {
            return -1;
        } else if (fruits.size() > box.getFruits().size()) {
            return 1;
        }
        return 0;
    }
}

