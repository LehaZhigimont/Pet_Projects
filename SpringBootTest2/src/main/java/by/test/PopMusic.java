package by.test;

import java.util.ArrayList;
import java.util.List;


public class PopMusic implements Music{
    private List<String> songList = new ArrayList<>();

    {
        songList.add("Цячэ вада у ярок");
        songList.add("Акрайчык");
        songList.add("Верер с моря дул");
    }
    @Override
    public List<String> getSong() {
        return songList;
    }
}
