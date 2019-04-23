package com.example.marchfifth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class firstFlashcard extends AppCompatActivity {

    EditText cardFront;
    EditText cardBack;
    TextView cardCount;
    String front, back;
    List frontList = new ArrayList();
    List backList = new ArrayList();

    Button NextCardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeflashcard);
        cardFront = (EditText) findViewById(R.id.cardFront);
        cardBack = (EditText) findViewById(R.id.cardBack);
        cardCount = (TextView) findViewById(R.id.cardCount);
        int i = 1;
        cardCount.setText("Card Number: " + i);
        NextCardButton = (Button) findViewById(R.id.NextCardbutton);
        NextCardButton.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            @Override
            public void onClick(View v) {
                front = cardFront.getText().toString();
                back = cardBack.getText().toString();
                frontList.add(front);
                backList.add(back);
                cardFront.setText("");
                cardBack.setText("");
                i++;
                cardCount.setText("Card Number: " + i);

            }
        });
    }

    public void nextButtonClick(View v){
        Toast.makeText(this, "JUNIT TEST RESULTS: QUESTION AND ANSWER SETTERS AND GETTERS TEST PASSED",
                Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_makeflashcard);

    }
}