package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Collections.reverseOrder());
        secondList.addAll(firstList);
        stringQueue.addAll(secondList);
        return stringQueue;
    }
}
