package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        return null;
    }
    public ArrayList<Integer> getIndex(String selection) {
        ArrayList<Integer> indexArray = new ArrayList<>();
        for(int i = 0; i < playList.length; i++){
            if(playList[i].equals(selection)){
                indexArray.add(i);
            }
        }

        return indexArray;
    }
}
