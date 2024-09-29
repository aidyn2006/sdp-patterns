package org.example.singeltonSdp;

public class Main {
    public static void main(String[] args) {
        GameConfig gameConfig=GameConfig.getInstance();

        GameConfig gameConfig1=GameConfig.getInstance();

        gameConfig.setLevel("easy");
        gameConfig.setResolution("1920X1980");
        gameConfig.setVolume("100");


        System.out.println("Level: "+gameConfig.getLevel());
        System.out.println("Resolution: "+gameConfig.getResolution());
        System.out.println("Volume: "+gameConfig.getVolume());

        System.out.println(gameConfig1==gameConfig);

    }
}
