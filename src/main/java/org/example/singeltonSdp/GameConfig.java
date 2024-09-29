package org.example.singeltonSdp;

public class GameConfig {

    private static volatile GameConfig gameConfig;

    private String resolution;
    private String volume;
    private String level;

    private GameConfig(){

    }
    public static synchronized GameConfig getInstance(){
        if(gameConfig==null){
            return gameConfig=new GameConfig();
        }
        return gameConfig;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
