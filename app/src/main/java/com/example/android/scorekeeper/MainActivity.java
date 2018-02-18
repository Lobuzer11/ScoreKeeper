package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulTeamA(0);
        displayFoulTeamB(0);
    }



    /**
     * This method is called when the +3 Points button is clicked.
     */
    public void plusThreePointsForA(View view) {
        /**int scoreTeamA = 3;*/
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +2 Points button is clicked.
     */
    public void plusTwoPointsForA(View view) {
        /**int point = 2;*/
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +1 Points button is clicked.
     */
    public void plusOnePointForA(View view) {
        /**int point = 1;*/
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Foul button is clicked.
     */
    public void plusOneFoulForA(View view) {
        /**int point = 1;*/
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    /**
     * This method is called when the +3 Points button is clicked.
     */
    public void plusThreePointsForB(View view) {
        /**int scoreTeamA = 3;*/
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the +2 Points button is clicked.
     */
    public void plusTwoPointsForB(View view) {
        /**int point = 2;*/
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the +1 Points button is clicked.
     */
    public void plusOnePointForB(View view) {
        /**int point = 1;*/
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Foul button is clicked.
     */
    public void plusOneFoulForB(View view) {
        /**int point = 1;*/
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    /**
     * This method reset the score counter for both teams A & B
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given foul for Team B.
     */
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
}
