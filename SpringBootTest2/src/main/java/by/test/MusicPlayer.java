package by.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private Music music;
    private Music music2;
    private List<Music> musicList = new ArrayList<>();


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(Music music, Music music2) {
        this.music = music;
        this.music2 = music2;
    }


    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public String playMusic(){
        Music music = musicList.get(new Random().nextInt(musicList.size()));
        return " Playing " + music.getSong().get(new Random().nextInt(music.getSong().size()));
    }
    public String playMusic(MusicGenre musicGenre) {
        //System.out.println("Playing " + music.getSong());
        if (musicGenre.equals(MusicGenre.CLASSIC)) {
            return " Playing " + music2.getSong().get(new Random().nextInt(music2.getSong().size()));
        } else
            return " Playing " + music.getSong().get(new Random().nextInt(music.getSong().size()));

    }
}