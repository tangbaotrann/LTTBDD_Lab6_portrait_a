package com.example.tuan6_lab6_portrait_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Render --> UI
        FragmentItem_Detail fragmentItem_detail = new FragmentItem_Detail();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.idFrameLayoutDetail, fragmentItem_detail, "FragmentItem_detail")
                .commit();
    }
}