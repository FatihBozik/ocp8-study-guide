package io.github.fatihbozik.ch3.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null

        System.out.println();

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek()); // 4
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 10
        System.out.println(stack.peek()); // null
    }
}
