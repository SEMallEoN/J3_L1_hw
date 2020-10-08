package J3_L1_hw_semenov;

import java.util.ArrayList;
import java.util.Arrays;

public class J3_L1_hw_semenov {
    public static void main(String[] args) {
        // задание 1
        Object array1[] = {1, 2, 3, 4};
//        Object array1[] = {"element1", "element2", "element3", "element4"};
        swap(array1, 1, 3);

        // задание 2
        Object array2[] = {"element1", "element2", "element3", "element4"};
//        Integer array2[] = {1,2,3,4};
        toArrayList(array2);

        // задание 3
        Box<Orange> boxOfOranges = new Box<Orange>();
        boxOfOranges.add(new Orange());
        System.out.println("В коробку добавили апельсины весом " + boxOfOranges.getWeight());
        Box<Apple> boxOfApples = new Box<Apple>();
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        System.out.println("В коробку добавили яблоки весом " + boxOfApples.getWeight());

        final int i = boxOfOranges.compareTo(boxOfApples);
        if (i == 0) {
            System.out.println("Вес коробок равен");
        } else {
            System.out.println("Вес коробок не равен");
        }

        Box<Orange> otherBoxOranges = new Box<Orange>();
        boxOfOranges.emptyFruit(otherBoxOranges);
        System.out.println(boxOfOranges.getWeight());
        System.out.println(otherBoxOranges.getWeight());

    }

    public static void swap(Object array[], int i1, int i2) {
        Object swapArray = array[i1];
        array[i1] = array[i2];
        array[i2] = swapArray;
        System.out.println(Arrays.toString(array));

    }

    public static <T> void toArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

    }

}
