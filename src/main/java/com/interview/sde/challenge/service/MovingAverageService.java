package com.interview.sde.challenge.service;

import java.util.Queue;

/**
 * Per request, the interface will leverage the function and features of Queue and LinkedList to accomplish the goal of easy
 * fetching the last N elements for further calculation.
 */
public interface MovingAverageService {

    /**
     * Add the element appending at the end of the current queue.
     * @param element type float
     */
    public void addElement(float element);

    /**
     * Calculate the moving average of last N elements, and return the average value.
     * @param n type int
     * @return float
     */
    public float getAverageOfLastN(int n);

    /**
     * Return all the elements of the current collection.(Queue)
     * @return Queue <Float>
     */
    public Queue<Float> getAllElements();
}
