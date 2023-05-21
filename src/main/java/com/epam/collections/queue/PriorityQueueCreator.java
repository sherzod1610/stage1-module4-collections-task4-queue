package com.epam.collections.queue;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        secondList.addAll(firstList);
        Iterator<String> iterable = secondList.iterator();
        while (iterable.hasNext()) {
            stringQueue.add(iterable.next());
        }
        return stringQueue;
    }
}
