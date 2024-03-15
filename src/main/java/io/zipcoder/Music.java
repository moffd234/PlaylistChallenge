package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private final String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        List<Integer> indexes = new ArrayList<>();

        return null;
    }

    // Gets all indexes at which the song resides
    public ArrayList<Integer> getIndex(String selection) {
        ArrayList<Integer> indexArray = new ArrayList<>();
        for(int i = 0; i < playList.length; i++){
            if(playList[i].equals(selection)){
                indexArray.add(i);
            }
        }

        return indexArray;
    }

    public int getNumJumps(int startIndex, int endIndex){
        int forward = startIndex;
        int forwardCounter = 0;
        while(forward != endIndex){
            forward++;
            forwardCounter++;

            // Send forward to the beginning of the playlist
            if(forward > playList.length - 1){
                forward = 0;
            }
        }

        int backward = startIndex;
        int backwardsCounter = 0;
        while(backward != endIndex){
            backward--;
            backwardsCounter++;

            // Send backwards to the end of the playlist
            if(backward < 0){
                backward = playList.length - 1;
            }
        }

        return Math.min(forwardCounter, backwardsCounter);
    }
}
