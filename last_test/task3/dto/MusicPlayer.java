package last_test.task3.dto;

import last_test.task3.dto.api.IMusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements IMusicPlayer {

    private final List<Song> songList = new ArrayList<>();

    @Override
    public List<Song> getSongs() {
        songList.add(new Song("Chubby Checker", "Let's Twist Again", new ArrayList<>(), new ArrayList<>(), 145));
        songList.add(new Song("Little Richard", "Tutti Frutti Take 2", new ArrayList<>(), new ArrayList<>(), 143));
        songList.add(new Song("JAWNIE", "Honeypie", new ArrayList<>(), new ArrayList<>(), 135));
        songList.add(new Song("Bill Haley & His Comets", "Rock around the clock", new ArrayList<>(), new ArrayList<>(), 126));
        songList.add(new Song("Bill Haley & His Comets", "Remastered", new ArrayList<>(), new ArrayList<>(), 135));
        songList.add(new Song("Chuck Berry", "Johny B. Good", new ArrayList<>(), new ArrayList<>(), 160));

        return this.songList;
    }

    @Override
    public Song getSong(int index) {
        return getSongs().get(index);
    }
}
