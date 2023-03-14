package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button leftThreeAddBtn = findViewById(R.id.left_three_points);
        Button rightThreeAddBtn = findViewById(R.id.right_three_points);
        Button leftTwoAddBtn = findViewById(R.id.left_two_points);
        Button rightTwoAddBtn = findViewById(R.id.right_two_points);
        Button left_free_throw = findViewById(R.id.left_free_throw);
        Button right_free_throw = findViewById(R.id.right_free_throw);
        Button resetBtn = findViewById(R.id.reset_btn);
        TextView teamA_score = findViewById(R.id.teamA_point);
        TextView teamB_score = findViewById(R.id.teamB_point);

        leftThreeAddBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int scoreA = Integer.parseInt((String) teamA_score.getText());
                scoreA+=3;
                teamA_score.setText(String.valueOf(scoreA));
            }
        });
        rightThreeAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreB = Integer.parseInt((String) teamB_score.getText());
                scoreB+=3;
                teamB_score.setText(String.valueOf(scoreB));
            }
        });
        leftTwoAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreA = Integer.parseInt((String) teamA_score.getText());
                scoreA+=2;
                teamA_score.setText(String.valueOf(scoreA));
            }
        });
        rightTwoAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreB = Integer.parseInt((String) teamB_score.getText());
                scoreB+=2;
                teamB_score.setText(String.valueOf(scoreB));
            }
        });
        left_free_throw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreA = Integer.parseInt((String) teamA_score.getText());
                scoreA ++;
                teamA_score.setText(String.valueOf(scoreA));
            }
        });
        right_free_throw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreB = Integer.parseInt((String) teamB_score.getText());
                scoreB ++;
                teamB_score.setText(String.valueOf(scoreB));
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreB = Integer.parseInt((String) teamB_score.getText());
                int scoreA = Integer.parseInt((String) teamA_score.getText());
                scoreA = 0;
                scoreB = 0;
                teamA_score.setText(String.valueOf(scoreA));
                teamB_score.setText(String.valueOf(scoreB));

            }
        });
    }
}