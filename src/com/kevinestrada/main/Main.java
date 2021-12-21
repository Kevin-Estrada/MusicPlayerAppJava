package com.kevinestrada.main;

import com.kevinestrada.test.MiniMiniMusicTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("THis is the test");
        MiniMiniMusicTest mini = new MiniMiniMusicTest();
        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }
}
