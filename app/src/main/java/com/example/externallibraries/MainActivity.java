package com.example.externallibraries;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.luciferx86.doodlecanvaslibrary.DoodleCanvas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    DoodleCanvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        canvas = findViewById(R.id.doodleCanvas);
        Button redButton = findViewById(R.id.redButton);
        Button blackButton = findViewById(R.id.blackButton);
        Button clearButton = findViewById(R.id.clearButton);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                canvas.setStrokeColor(Color.RED);
            }
        });

        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                canvas.setStrokeColor(Color.BLACK);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                canvas.clearCanvas();
            }
        });
    }

}
