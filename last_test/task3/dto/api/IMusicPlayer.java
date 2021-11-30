package last_test.task3.dto.api;

import last_test.task3.dto.Song;

import java.util.List;

public interface IMusicPlayer {

    /**
     * Метод, который выдает список песен
     *
     * @return список песен
     */
    List<Song> getSongs();

    /**
     * Метод, который выдает песню по индексу
     *
     * @param index индекс песни
     * @return песня
     */
    Song getSong(int index);
}
