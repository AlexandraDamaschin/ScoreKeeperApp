package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    football with score and fouls
    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }

    //team A score
    public void displayForTeamA(int score) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void increment3PointsA(View view) {
        team_a_score += 3;
        displayForTeamA(team_a_score);
    }

    public void increment2PointsA(View view) {
        team_a_score += 2;
        displayForTeamA(team_a_score);
    }

    public void increment1PointA(View view) {
        team_a_score += 1;
        displayForTeamA(team_a_score);
    }

    //    team B score
    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void increment3PointsB(View view) {
        team_b_score += 3;
        displayForTeamB(team_b_score);
    }

    public void increment2PointsB(View view) {
        team_b_score += 2;
        displayForTeamB(team_b_score);
    }

    public void increment1PointB(View view) {
        team_b_score += 1;
        displayForTeamB(team_b_score);
    }

    public void resetScore(View view) {
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }
}
//maybe git is working?
// second