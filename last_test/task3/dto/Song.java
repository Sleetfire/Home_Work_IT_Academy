package last_test.task3.dto;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

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

    @Override
    public String toString() {
        long minutes = TimeUnit.SECONDS.toMinutes(this.songLength);
        long seconds = this.songLength - minutes * 60;
        return this.songName + " - " + this.singer + " " + minutes +":" + seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songLength == song.songLength && Objects.equals(singer, song.singer) &&
                Objects.equals(songName, song.songName) && Objects.equals(genresList, song.genresList) &&
                Objects.equals(moodsList, song.moodsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singer, songName, genresList, moodsList, songLength);
    }
}
