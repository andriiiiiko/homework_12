package com.andriiiiiko.task1;

public class TimerRunnable implements Runnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;

            System.out.println("Пройшло " + elapsedTime / 1000 + " секунд");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
