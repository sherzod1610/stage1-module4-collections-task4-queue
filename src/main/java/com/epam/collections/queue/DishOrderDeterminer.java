package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int count = 1;
        while (!queue.isEmpty()) {
            int dish = queue.poll();
            if (count % everyDishNumberToEat == 0) {
                list.add(dish);
            } else {
                queue.add(dish);
            }
            count++;
        }
        return list;
    }
}
