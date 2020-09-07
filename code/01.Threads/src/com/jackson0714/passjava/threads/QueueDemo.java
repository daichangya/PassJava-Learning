package com.jackson0714.passjava.threads;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.*;

/**
 * @Author: 悟空聊架构| PassJava666
 * @Date: 2020/9/5 13:32
 * @Site: www.jayh.club
 * @Github: https://github.com/Jackson0714
 */
public class QueueDemo {

    public static void main(String[] args) {
        //ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        LinkedBlockingDeque queue = new LinkedBlockingDeque();
        queue.addFirst("test1");
        queue.addFirst(300);
        queue.addLast("400");

        queue.add(100);
        queue.add(200);

        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();

        BuildingBlockWithName buildingBlock = new BuildingBlockWithName("三角形", "A");

        concurrentLinkedQueue.add(buildingBlock);

        LinkedList linkedList = new LinkedList();
        linkedList.add(buildingBlock);

        List list = Collections.synchronizedList(new LinkedList<>());

        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i = 0; i < 50; i++) {
            arrayDeque.add(buildingBlock);
        }

        BuildingBlockWithName buildingBlock1 = new BuildingBlockWithName("三角形", "A");
        BuildingBlockWithName buildingBlock2 = new BuildingBlockWithName("四边形", "B");
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        concurrentLinkedDeque.addFirst(buildingBlock1);
        concurrentLinkedDeque.addLast(buildingBlock2);
        //结果：顺序：三角形、四边形

        //TransferQueue;
        //int a = queue.peek();
//        PriorityQueue;
//        Deque;
//        LinkedBlockingDeque;

    }
}