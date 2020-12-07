package ru.PolukarovIvan.lab_22.ex3;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Info worker = new Info("Ivan Polukarov");
        worker.setStart();

        System.out.println("Started at: " + worker.getStart());

        for(int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Working...");
        }

        worker.setFinish();

        System.out.println("Finished at:" + worker.getFinish());

        System.out.println(worker.toString());
    }
}
