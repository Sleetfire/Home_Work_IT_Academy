package last_test.task3.dto;

import last_test.task3.dto.api.IMusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements IMusicPlayer {

    private final List<Song> songList = new ArrayList<>();

    /**
     * Метод, который выдает список песен
     *
     * @return список песен
     */
    @Override
    public List<Song> getSongs() {

        List<Genres> songGenres1 = new ArrayList<>();
        songGenres1.add(Genres.ROCK);
        songGenres1.add(Genres.JAZZ);

        List<Genres> songGenres2 = new ArrayList<>();
        songGenres2.add(Genres.POP);

        List<Genres> songGenres3 = new ArrayList<>();
        songGenres3.add(Genres.HIP_HOP);
        songGenres3.add(Genres.RAP);

        List<Genres> songGenres4 = new ArrayList<>();
        songGenres4.add(Genres.INDIE);
        songGenres4.add(Genres.ROCK);

        List<Genres> songGenres5 = new ArrayList<>();
        songGenres5.add(Genres.TECHNO);
        songGenres5.add(Genres.HIP_HOP);

        List<Genres> songGenres6 = new ArrayList<>();
        songGenres6.add(Genres.JAZZ);

        List<Moods> songMoods1 = new ArrayList<>();
        songMoods1.add(Moods.HAPPY);
        songMoods1.add(Moods.ENERGETIC);

        List<Moods> songMoods2 = new ArrayList<>();
        songMoods2.add(Moods.SAD);
        songMoods2.add(Moods.DEPRESSION);

        List<Moods> songMoods3 = new ArrayList<>();
        songMoods3.add(Moods.SPORT);

        List<Moods> songMoods4 = new ArrayList<>();
        songMoods4.add(Moods.CALM);
        songMoods4.add(Moods.HAPPY);

        List<Moods> songMoods5 = new ArrayList<>();
        songMoods5.add(Moods.ENERGETIC);
        songMoods5.add(Moods.SPORT);

        List<Moods> songMoods6 = new ArrayList<>();
        songMoods1.add(Moods.CALM);
        songMoods1.add(Moods.SAD);

        songList.add(new Song("Chubby Checker", "Let's Twist Again", songGenres1, songMoods1, 145));
        songList.add(new Song("Little Richard", "Tutti Frutti Take 2", songGenres2, songMoods2, 143));
        songList.add(new Song("JAWNIE", "Honeypie", songGenres3, songMoods3, 135));
        songList.add(new Song("Bill Haley & His Comets", "Rock around the clock", songGenres4, songMoods4, 126));
        songList.add(new Song("Bill Haley & His Comets", "Remastered", songGenres5, songMoods5, 135));
        songList.add(new Song("Chuck Berry", "Johny B. Good", songGenres6, songMoods6, 160));

        return this.songList;
    }

    /**
     * Метод, который выдает песню по индексу
     *
     * @param index индекс песни
     * @return песню
     */
    @Override
    public Song getSong(int index) {
        return getSongs().get(index);
    }

}


