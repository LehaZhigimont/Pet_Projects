package by.test;

import java.util.ArrayList;
import java.util.List;


public class ClassicMusic implements Music{
    private List<String> songList = new ArrayList<>();

    {
        songList.add("Бетховен");
        songList.add("Шопен");
        songList.add("Моцарт");
    }



    @Override
    public List<String> getSong() {
        return songList;
    }




}
