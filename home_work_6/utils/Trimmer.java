package home_work_6.utils;

public class Trimmer {

    /**
     * Метод, который обрезает путь до файла
     *
     * @param path  полный путь до файла
     * @param files массив с названиями файлов
     * @return возвращает название файла без указания его расположения
     */
    public static String trimPath(String path, String[] files) {
        for (String file : files) {
            if (path.contains(file)) {
                return file;
            }
        }
        return path;
    }

}
