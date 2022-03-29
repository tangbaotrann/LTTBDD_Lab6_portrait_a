package com.example.tuan6_lab6_portrait_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Render --> UI
        FragmentItem fragmentItem = new FragmentItem();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.idFrameLayout, fragmentItem, "FragmentItem")
                .commit();
    }
}