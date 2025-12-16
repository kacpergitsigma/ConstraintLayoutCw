package com.pt2.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore() {
        if(score == null) {
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;
    }

    public void setScore(MutableLiveData<Integer> score) {
        if(score == null) {
            score = new MutableLiveData<>();
        }
        this.score = score;
    }

    public void addScore(int amountToAdd) {
        if(score == null) {
            score = new MutableLiveData<>();
        }
        this.score.setValue(score.getValue() + amountToAdd);
    }
}
