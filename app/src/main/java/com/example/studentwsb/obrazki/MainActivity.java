package com.example.studentwsb.obrazki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        int pln = Integer.parseInt(editText.getText().toString());
        double kursDolar = 3.90;
        double result = pln * kursDolar ;
        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
