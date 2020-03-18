package com.interview.sde.challenge.service.impl;

import com.interview.sde.challenge.service.MovingAverageService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class MovingAverageServiceImpl implements MovingAverageService {

    private final Queue<Float> queue = new LinkedList<>();
    private float totalSum = 0;

    @Override
    public void addElement(float element) {
            queue.offer(element);
            totalSum += element;
    }

    @Override
    public float getAverageOfLastN(int n) {
        float total = totalSum;
        Queue<Float> tempQueue = new LinkedList<>();
        tempQueue.addAll(queue);
        while(tempQueue.size() > n) {
            total = total - tempQueue.poll();
        }
        return total / n;
    }

    @Override
    public Queue<Float> getAllElements() {
        return queue;
    }
}
