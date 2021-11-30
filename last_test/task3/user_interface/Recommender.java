package last_test.task3.user_interface;

import last_test.task3.dto.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Recommender {

    private final Scanner scanner = new Scanner(System.in);
    private final MusicPlayer musicPlayer;
    private final RecommendationGenerator generator;

    public Recommender(MusicPlayer musicPlayer, RecommendationGenerator generator) {
        this.musicPlayer = musicPlayer;
        this.generator = generator;
    }

    /**
     * Метод, который предлагает выбрать жанр
     * @return жанр
     */
    private String chooseGenre() {
        System.out.println("Список жанров: ");
        System.out.println(Arrays.toString(Genres.values()));
        System.out.println("Введите жанр: ");
        return scanner.next().toUpperCase(Locale.ROOT);
    }

    /**
     * Метод, который предлагает выбрать настроение
     * @return настроение
     */
    private String chooseMood() {
        System.out.println("Список настроений: ");
        System.out.println(Arrays.toString(Moods.values()));
        System.out.println("Введите настроение: ");
        String mood = scanner.next().toUpperCase(Locale.ROOT);
        System.out.println("Рекомендуемые песни: ");
        return mood;
    }

    /**
     * Метод, который предлагает выбрать номер песни
     * @return номер песни
     */
    private int chooseSongNumber() {
        List<Song> songList = this.musicPlayer.getSongs();
        int number;
        do {
            System.out.println("Выберите номер песни: ");
            number = scanner.nextInt();
        } while (number < 0 || number > songList.size());
        return number;
    }

    /**
     * Метод, который печатает в консоль рекомендации песен на основе жанра
     */
    public void printGenreRecommendation() {
        try {
            for (Song song : generator.getRecommendationByGenre(this.musicPlayer, Genres.valueOf(chooseGenre()))) {
                System.out.println(song);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Метод, который печатает в консоль рекомендации песен на основе настроения
     */
    public void printMoodRecommendation() {
        try {
            for (Song song : generator.getRecommendationByMood(this.musicPlayer, Moods.valueOf(chooseMood()))) {
                System.out.println(song);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Метод, который печатает в консоль рекомендации песен на основе жанра и настроения
     */
    public void printGenreAndMoodRecommendation() {
        try {
            for (Song song : generator.getRecommendationByGenreAndMood(this.musicPlayer, Genres.valueOf(chooseGenre()),
                    Moods.valueOf(chooseMood()))) {
                System.out.println(song);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Метод, который печатает в консоль рекомендации песен на основе выбранной песни
     */
    public void printSongRecommendation() {
        List<Song> songs = this.musicPlayer.getSongs().stream()
                .distinct()
                .collect(Collectors.toList());
        int count = 0;
        System.out.println("Список песен: ");
        for (Song song : songs) {
            System.out.println(count + " " + song);
            count++;
        }
        for (Song song : this.generator.getRecommendationBySong(this.musicPlayer,
                musicPlayer.getSong(chooseSongNumber()))) {
            System.out.println(song);
        }
    }
}
