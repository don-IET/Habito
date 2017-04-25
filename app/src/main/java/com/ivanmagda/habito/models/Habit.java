package com.ivanmagda.habito.models;

import com.ivanmagda.habito.utils.HabitoScoreUtils;

public final class Habit implements Cloneable {

    private String mId;
    private HabitRecord mRecord;

    public Habit() {
        this.mRecord = new HabitRecord();
    }

    public Habit(String id, HabitRecord record) {
        this.mId = id;
        this.mRecord = record;
    }

    public Habit copy() {
        return new Habit(mId, mRecord.copy());
    }

    //dont mess with this
    @Override
    public Object clone() {
        return copy();
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public HabitRecord getRecord() {
        return mRecord;
    }

    public void setRecord(HabitRecord record) {
        this.mRecord = record;
    }

    public boolean isReminderOn() {
        return (mRecord.getReminderHour() != HabitRecord.REMINDER_OFF &&
                mRecord.getReminderMin() != HabitRecord.REMINDER_OFF);
    }

    public synchronized void increaseScore() {
        HabitoScoreUtils.increaseScore(this);
    }

    public synchronized void decreaseScore() {
        HabitoScoreUtils.decreaseScore(this);
    }

    @Override
    public String toString() {
        return "Habit{" +
                "id='" + mId + '\'' +
                ", record=" + mRecord +
                '}';
    }

}
