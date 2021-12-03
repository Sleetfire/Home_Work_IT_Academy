package home_work_plus.strings_numerals;

import home_work_plus.strings_numerals.api.INumeralTranslator;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class NumeralTranslator implements INumeralTranslator {

    @Override
    public String toString(int number) {
        List<Integer> stack = new ArrayList<>();
        int temp;
        while (number != 0) {
            temp = number % 10;
            stack.add(temp);
            number /= 10;
        }
        StringBuilder builder = new StringBuilder();
        Map<Integer, String> numeralsTable = getNumeralsTable();
        int n = stack.size() - 1;
        Collections.reverse(stack);
        int currentNumber;
        for (Integer integer : stack) {
            if (integer != 0) {
                currentNumber = integer * (int) Math.pow(10, n);

                if (currentNumber > 10_000) {

                    builder.append(numeralsTable.get(integer * 10)).append(" ").append(numeralsTable.get(1000)).append(" ");
                } else if (currentNumber > 1000) {
                    builder.append(numeralsTable.get(integer)).append(" ").append(numeralsTable.get(1000)).append(" ");
                } else {
                    builder.append(numeralsTable.get(currentNumber)).append(" ");
                }
                n--;
            }
        }

        char firstSymbol = builder.charAt(0);
        builder.setCharAt(0, Character.toUpperCase(firstSymbol));
        return builder.toString();
    }

    private Map<Integer, String> getNumeralsTable() {
        Map<Integer, String> numeralsMap = new HashMap<>();
        numeralsMap.put(1, "один");
        numeralsMap.put(2, "два");
        numeralsMap.put(3, "три");
        numeralsMap.put(4, "четыре");
        numeralsMap.put(5, "пять");
        numeralsMap.put(6, "шесть");
        numeralsMap.put(7, "семь");
        numeralsMap.put(8, "восемь");
        numeralsMap.put(9, "девять");
        numeralsMap.put(10, "десять");
        numeralsMap.put(11, "одиннадцать");
        numeralsMap.put(12, "двенадцать");
        numeralsMap.put(13, "тринадцать");
        numeralsMap.put(14, "четырнадцать");
        numeralsMap.put(15, "пятнадцать");
        numeralsMap.put(16, "шестнадцать");
        numeralsMap.put(17, "семнадцать");
        numeralsMap.put(18, "восемнадцать");
        numeralsMap.put(19, "девятнадцать");
        numeralsMap.put(20, "двадцать");
        numeralsMap.put(30, "тридцать");
        numeralsMap.put(40, "сорок");
        numeralsMap.put(50, "пятьдесят");
        numeralsMap.put(60, "шестьдесят");
        numeralsMap.put(70, "семьдесят");
        numeralsMap.put(80, "восемьдесят");
        numeralsMap.put(90, "девяносто");
        numeralsMap.put(100, "сто");
        numeralsMap.put(200, "двести");
        numeralsMap.put(300, "триста");
        numeralsMap.put(400, "четыреста");
        numeralsMap.put(500, "пятьсот");
        numeralsMap.put(600, "шестьсот");
        numeralsMap.put(700, "семьсот");
        numeralsMap.put(800, "восемьсот");
        numeralsMap.put(900, "девятьсот");
        numeralsMap.put(1000, "тысяча");
        numeralsMap.put(1000_000, "миллион");
        return numeralsMap;
    }

    @Override
    public String toString(double number) {
        return null;
    }

    @Override
    public String toWeek(int day) {
        int weeks = day / 7;
        int remains = weeks % 10;
        StringBuilder builder = new StringBuilder();
        if (remains == 1 && weeks != 11) {
            builder.append(weeks).append(" неделя");
        } else if (remains == 2 && weeks % 100 != 12 || remains == 3 && weeks % 100 != 13 || remains == 4 &&
                weeks % 100 != 14) {
            builder.append(weeks).append(" недели");
        } else {
            builder.append(weeks).append(" недель");
        }

        return builder.toString();
    }

    @Override
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        long hours = TimeUnit.MILLISECONDS.toHours(millisecond);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millisecond) - hours * 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecond) - minutes * 60 - hours * 3600;
        long updatedMilliseconds = millisecond - seconds * 1000 - minutes * 60_000 - hours * 3600_000;
        StringBuilder builder = new StringBuilder();
        if (shortFormat) {
            if (hours < 10) {
                builder.append("0").append(hours);
            } else {
                builder.append(hours);
            }
            builder.append(":");
            if (minutes < 10) {
                builder.append("0").append(minutes);
            } else {
                builder.append(minutes);
            }
            builder.append(":");
            if (seconds < 10) {
                builder.append("0").append(seconds);
            } else {
                builder.append(seconds);
            }
            builder.append(":");
            if (updatedMilliseconds < 10) {
                builder.append("00").append(updatedMilliseconds);
            } else if (updatedMilliseconds < 100) {
                builder.append("0").append(updatedMilliseconds);
            } else {
                builder.append(updatedMilliseconds);
            }
        } else {
            long hoursRemains = hours % 10;
            if (hoursRemains == 1 && hours != 11) {
                builder.append(hours).append(" час ");
            } else if (hoursRemains == 2 && hours % 100 != 12 || hoursRemains == 3 && hours % 100 != 13 ||
                    hoursRemains == 4 && hours % 100 != 14) {
                builder.append(hours).append(" часа ");
            } else {
                builder.append(hours).append(" часов ");
            }

            long minutesRemains = minutes % 10;
            if (minutesRemains == 1 && minutes != 11) {
                builder.append(minutes).append(" минута ");
            } else if (minutesRemains == 2 && minutes % 100 != 12 || minutesRemains == 3 && minutes % 100 != 13 ||
                    minutesRemains == 4 && minutes % 100 != 14) {
                builder.append(minutes).append(" минуты ");
            } else {
                builder.append(minutes).append(" минут ");
            }

            long secondRemains = seconds % 10;
            if (secondRemains == 1 && seconds != 11) {
                builder.append(seconds).append(" секунда ");
            } else if (secondRemains == 2 && seconds % 100 != 12 || secondRemains == 3 && seconds % 100 != 13 ||
                    secondRemains == 4 && seconds % 100 != 14) {
                builder.append(seconds).append(" секунды ");
            } else {
                builder.append(seconds).append(" секунд ");
            }

            long millisecondRemains = updatedMilliseconds % 10;
            if (millisecondRemains == 1 && updatedMilliseconds != 11) {
                builder.append(updatedMilliseconds).append(" миллисекунда");
            } else if (millisecondRemains == 2 && updatedMilliseconds % 100 != 12 || millisecondRemains == 3 &&
                    updatedMilliseconds % 100 != 13 || millisecondRemains == 4 && updatedMilliseconds % 100 != 14) {
                builder.append(updatedMilliseconds).append(" миллисекунды");
            } else {
                builder.append(updatedMilliseconds).append(" миллисекунд");
            }
        }
        return builder.toString();
    }
}
