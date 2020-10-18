package ru.PolukarovIvan.lab_08.ex3;

import java.io.File;

public class Animation implements Runnable {
    private Window mainWindow;
    private File[] abcArgs;
    String[] paths;
    private static int counter = 0;

    Animation(String []args){

        File file = new File(args[0]);
        System.out.println(file.getName());

        abcArgs = file.listFiles();

        paths = new String[abcArgs.length];

        for (int i = 0; i < abcArgs.length; i++){
            paths[i] = args[0] + abcArgs[i].getName();
        }

        mainWindow = new Window(paths[0]);

        while (true)
            run();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            counter = (counter + 1) % paths.length;
            mainWindow.selectPicture(paths[counter]);
            mainWindow.paint(mainWindow.getGraphics());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}