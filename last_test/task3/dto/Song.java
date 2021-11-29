package last_test.task3.dto;

import java.util.List;

public class Song {
    private String singer;
    private String songName;
    private List<Genres> genresList;
    private List<Moods> moodsList;
    private int songLength;

    public Song(String singer, String songName, List<Genres> genresList, List<Moods> moodsList, int songLength) {
        this.singer = singer;
        this.songName = songName;
        this.genresList = genresList;
        this.moodsList = moodsList;
        this.songLength = songLength;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public List<Genres> getGenresList() {
        return genresList;
    }

    public void setGenresList(List<Genres> genresList) {
        this.genresList = genresList;
    }

    public List<Moods> getMoodsList() {
        return moodsList;
    }

    public void setMoodsList(List<Moods> moodsList) {
        this.moodsList = moodsList;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }
}
