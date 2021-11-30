package last_test.task3.dto;

import last_test.task3.dto.api.IRecommendationGenerator;

import java.util.*;

public class RecommendationGenerator implements IRecommendationGenerator {

    /**
     * Метод, который выдает рекомендации по жанру
     *
     * @param player плеер, где хранится музыка
     * @param genre  жанр музыки
     * @return множество песен
     */
    public Set<Song> getRecommendationByGenre(MusicPlayer player, Genres genre) {
        Set<Song> searchedSongs = new HashSet<>();
        List<Song> songList = player.getSongs();
        for (Song song : songList) {
            for (Genres genres : song.getGenresList()) {
                if (Objects.equals(genres, genre)) {
                    searchedSongs.add(song);
                    break;
                }
            }
        }
        return searchedSongs;
    }

    /**
     * Метод, который выдает рекомендации на основе настроения
     *
     * @param player плеер, где хранится музыка
     * @param mood   настроение музыки
     * @return множество песен
     */
    public Set<Song> getRecommendationByMood(MusicPlayer player, Moods mood) {
        Set<Song> searchedSongs = new HashSet<>();
        List<Song> songList = player.getSongs();
        for (Song song : songList) {
            for (Moods moods : song.getMoodsList()) {
                if (Objects.equals(moods, mood)) {
                    searchedSongs.add(song);
                    break;
                }
            }
        }
        return searchedSongs;
    }

    /**
     * Метод, который выдает рекомендации на основе жанра и настроения
     *
     * @param player плеер, где хранится музыка
     * @param genre  жанр музыки
     * @param mood   настроение музыки
     * @return множество песен
     */
    public Set<Song> getRecommendationByGenreAndMood(MusicPlayer player, Genres genre, Moods mood) {
        Set<Song> searchedSongs = new HashSet<>();
        Set<Song> genresSearchedList1 = getRecommendationByGenre(player, genre);
        Set<Song> genresSearchedList2 = getRecommendationByMood(player, mood);
        for (Song song1 : genresSearchedList1) {
            for (Song song2 : genresSearchedList2) {
                if (Objects.equals(song1, song2)) {
                    searchedSongs.add(song1);
                    break;
                }
            }
        }
        return searchedSongs;
    }

    /**
     * Метод, который выдает рекомендации на основе переданной песни
     *
     * @param player плеер, где хранится музыка
     * @param song   песня
     * @return множество песен
     */
    public Set<Song> getRecommendationBySong(MusicPlayer player, Song song) {
        if (player.getSongs().stream().noneMatch(song1 -> Objects.equals(song1, song))) {
            return new HashSet<>();
        }
        Set<Song> searchedSongs = new HashSet<>();
        List<Song> songs = player.getSongs();
        List<Genres> genresList = song.getGenresList();
        List<Moods> moodsList = song.getMoodsList();
        for (Song song1 : songs) {
            for (Genres genre : genresList) {
                if (song1.getGenresList().stream().anyMatch(genres -> Objects.equals(genres, genre))) {
                    searchedSongs.add(song1);
                    break;
                }
            }

            if (Objects.equals(moodsList, song1.getMoodsList())) {
                searchedSongs.add(song1);
            }
        }
        return searchedSongs;
    }
}
