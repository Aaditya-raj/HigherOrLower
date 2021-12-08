package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    int result;

    public void guess(View view){
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int num = Integer.parseInt(editText.getText().toString());

        if(num> result)
            Toast.makeText(MainActivity.this,"Lower!",Toast.LENGTH_SHORT).show();
        else if(num<result)
            Toast.makeText(MainActivity.this,"Higher!",Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(MainActivity.this, "That's right! Try again!", Toast.LENGTH_SHORT).show();

            Random r = new Random();
            int low = 1;
            int high = 20;
            result = r.nextInt(high-low+1) + low;

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int low = 1;
        int high = 20;
        result = r.nextInt(high-low+1) + low;
    }
}