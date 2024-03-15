package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MusicTest {

    @Test
    public void selectionTest1(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIndexTest(){
        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 3));
        
        ArrayList<Integer> actual = music.getIndex("liveoak");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumJumps(){
        // Given
        String[] playList = {"dancinginthedark","rio","liveoak","liveoak", "Longview", "When I come around"};
        Music music = new Music(playList);
        Integer expected = 2;

        // When
        Integer actual = music.getNumJumps(1, 5);

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumJumps1(){
        // Given
        String[] playList = {"dancinginthedark","rio","liveoak","liveoak", "Longview", "When I come around"};
        Music music = new Music(playList);
        Integer expected = 1;

        // When
        Integer actual = music.getNumJumps(4, 5);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
