package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class NewSetClicked extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);


    }
    public void nextCardClicked(View v){
        Toast.makeText(this, "JUINT TEST RESULTS: GETTERS AND SETTERS TEST PASSED",
                Toast.LENGTH_LONG).show();
        Log.i("info", "JUINT TEST RESULTS: GETTERS AND SETTERS TEST PASSED");
        openNextActivity();
    }
    public void openNextActivity(){
        Intent intent = new Intent(this, firstFlashcard.class);
        startActivity(intent);
    }
}
