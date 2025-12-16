package com.pt2.myapplication;

import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void addScore(int amountToAdd) {
        this.score += amountToAdd;
    }
}
