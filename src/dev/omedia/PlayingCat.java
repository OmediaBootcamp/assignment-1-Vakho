package dev.omedia;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        int tempUpperLimit = summer ? 45 : 35;
        int tempLowerLimit = 25;
        if(temperature <= tempUpperLimit && temperature >= tempLowerLimit){
            return true;
        }

        return false;
    }
}