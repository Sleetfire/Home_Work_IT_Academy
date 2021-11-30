package last_test.task3.runners;

import last_test.task3.dto.*;
import last_test.task3.user_interface.Recommender;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        RecommendationGenerator generator = new RecommendationGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Получить рекомендации по жанру");
        System.out.println("2 - Получить рекомендации по настроению");
        System.out.println("3 - Получить рекомендации по жанру и настроению");
        System.out.println("4 - Получить рекомендации по песне");
        System.out.print("Введите номер: ");
        int choice = scanner.nextInt();
        Recommender recommender = new Recommender(musicPlayer, generator);

        switch (choice) {
            case 1: {
                recommender.printGenreRecommendation();
            }
            break;

            case 2: {
                recommender.printMoodRecommendation();
            }
            break;

            case 3: {
                recommender.printGenreAndMoodRecommendation();
            }
            break;

            case 4: {
                recommender.printSongRecommendation();
            }
            break;
        }
    }
}
