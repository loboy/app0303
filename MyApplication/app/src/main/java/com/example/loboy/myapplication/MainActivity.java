package com.example.loboy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  submit(View view)
    {
        Toast.makeText(this, "Hello World 20160307!!!", Toast.LENGTH_LONG).show();
    }
}
