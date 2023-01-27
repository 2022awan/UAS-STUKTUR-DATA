package no1;

import Modul.Mahasiswa;

import java.util.Stack;

public class no1 {
    private static StackQueue;

    public static void getNo1() {
        Object StackQueue = new StackQueue(10);
        Stack.push(new Mahasiswa("Fauzi", "22552011094", "TIF RM 22 A "));
        Stack.push(new Mahasiswa("Awan", "22552011143", "TIF RM 22 B "));
        Stack.push(new Mahasiswa("Nana", "22552011991", "TIF RM 22 C "));

        Stack.print();
        Stack.peek();
        Stack.pop();
        Stack.print();
        Stack.clear();
        Stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("Fauzi", "22552011094", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("Awan", "22552011143", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("Nana", "22552011991", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}