package by.test;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{
    private List<String> songList = new ArrayList<>();
    {
        songList.add("Metallica");
        songList.add("Queen");
        songList.add("Nirvana");
    }
    @Override
    public List<String> getSong() {
        return songList;
    }
}
