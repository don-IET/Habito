package com.ivanmagda.habito.view.model;

import android.support.annotation.NonNull;

import com.ivanmagda.habito.barchart.HabitoBarChartRange;
import com.ivanmagda.habito.utils.HabitoDateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class HabitDetailViewModel {

    private HabitoBarChartRange.DateRange mDateRange = HabitoBarChartRange.DateRange.WEEK;

    public HabitDetailViewModel() {
    }

    public HabitDetailViewModel(@NonNull HabitoBarChartRange.DateRange dateRange) {
        this.mDateRange = dateRange;
    }

    public void setDateRange(HabitoBarChartRange.DateRange dateRange) {
        this.mDateRange = dateRange;
    }

    public String getScoreString(int score) {
        return String.valueOf(score);
    }

    public String getDateRangeString() {
        switch (mDateRange) {
            case WEEK:
                return getFormattedWeek(HabitoDateUtils.getStartOfCurrentWeek(),
                        HabitoDateUtils.getEndOfCurrentWeek());
            case MONTH:
                return getFormattedMonth(HabitoDateUtils.getStartOfCurrentMonth(),
                        HabitoDateUtils.getEndOfCurrentMonth());
            case YEAR:
                return getFormattedYear(HabitoDateUtils.getStartOfCurrentYear(),
                        HabitoDateUtils.getEndOfCurrentYear());
            default:
                throw new IllegalArgumentException("Receive illegal date range");
        }
    }

    private String getFormattedWeek(long start, long end) {
        SimpleDateFormat weekFormat = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
        return formatDates(weekFormat, start, end);
    }

    private String getFormattedMonth(long start, long end) {
        SimpleDateFormat monthFormat = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
        return formatDates(monthFormat, start, end);
    }

    private String getFormattedYear(long start, long end) {
        SimpleDateFormat yearFormat = new SimpleDateFormat("MMM yyyy", Locale.getDefault());
        return formatDates(yearFormat, start, end);
    }

    private String formatDates(SimpleDateFormat dateFormat, long start, long end) {
        return dateFormat.format(new Date(start))
                + " - "
                + dateFormat.format(new Date(end));
    }

}
