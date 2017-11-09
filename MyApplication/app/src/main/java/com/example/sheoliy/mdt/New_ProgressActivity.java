package com.example.sheoliy.mdt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Sheoliy on 2017/7/11.
 */
public class New_ProgressActivity extends AppCompatActivity {

    private ImageView ImageView_7;
    private ImageView ImageView_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_progress);
        ImageView_7 = (ImageView) findViewById(R.id.imageView_7);
        ImageView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(New_ProgressActivity.this, New_Progress_new.class);
                startActivity(intent);
            }
        });
        ImageView_8 = (ImageView) findViewById(R.id.imageView_8);
        ImageView_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(New_ProgressActivity.this, New_progress_wuhou.class);
                startActivity(intent);
            }
        });
    }
}
