package com.pt2.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.pt2.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding; // klasa z bindowanymi widokami
    // od activity_main.xml
    ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        scoreViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);

        scoreViewModel.getScore().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textView.setText(integer + "");
                    }
                });

        binding.textView.setText(scoreViewModel.getScore() + "");

        binding.button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        scoreViewModel.addScore(1);
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        scoreViewModel.addScore(2);
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        scoreViewModel.addScore(3);
                    }
                }
        );
    }
}