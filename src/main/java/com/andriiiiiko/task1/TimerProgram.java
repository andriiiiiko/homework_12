package com.andriiiiiko.task1;

public class TimerProgram {
    public static void main(String[] args) {
        Thread timerThread = new Thread(new TimerRunnable());
        Thread messageThread = new Thread(new MessageRunnable());

        timerThread.start();
        messageThread.start();
    }
}
