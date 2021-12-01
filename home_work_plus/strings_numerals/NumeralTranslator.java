package home_work_plus.strings_numerals;

import home_work_plus.strings_numerals.api.INumeralTranslator;

import java.util.concurrent.TimeUnit;


public class NumeralTranslator implements INumeralTranslator {

    @Override
    public String toString(int number) {
        return null;
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
        } else if (remains == 2 || remains == 3 || remains == 4) {
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
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecond) - hours * 3600;
        long updatedMilliseconds = millisecond - hours * 3600_000;
        if (shortFormat) {
            return hours + ":" + minutes + ":" + seconds + ":" + updatedMilliseconds;
        } else {
            return null;
        }
    }
}
