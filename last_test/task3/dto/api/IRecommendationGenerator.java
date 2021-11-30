package last_test.task3.dto.api;

import last_test.task3.dto.Genres;
import last_test.task3.dto.Moods;
import last_test.task3.dto.MusicPlayer;
import last_test.task3.dto.Song;

import java.util.Set;

public interface IRecommendationGenerator {

    Set<Song> getRecommendationByGenre(MusicPlayer player, Genres genre);

    Set<Song> getRecommendationByMood(MusicPlayer player, Moods mood);

    Set<Song> getRecommendationByGenreAndMood(MusicPlayer player, Genres genre, Moods mood);

    Set<Song> getRecommendationBySong(MusicPlayer player, Song song);

}
