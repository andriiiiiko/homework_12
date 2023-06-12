package com.andriiiiiko.task2;

import java.util.concurrent.ConcurrentHashMap;

public class FizzBuzz {
    private int n;
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                map.put(i, "fizz");
            }
        }
    }

    public void buzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                map.put(i, "buzz");
            }
        }
    }

    public void fizzbuzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                map.put(i, "fizzbuzz");
            }
        }
    }

    public void number() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            } else {
                System.out.print(map.get(i));
            }
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}
