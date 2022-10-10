package com.example.frametoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);
        img1=(ImageView)findViewById(R.id.imageView1);
        img.setOnClickListener(this ::Clicked);
        img1.setOnClickListener(this ::Clicked);
        img2=(ImageView)findViewById(R.id.imageView2);
        img2.setOnClickListener(this ::Clicked);
        img3=(ImageView)findViewById(R.id.imageView3);
        img3.setOnClickListener(this ::Clicked);
    }
    public void Clicked(View view)
    {
        if(view.getId()==R.id.imageView) {
            img1.setVisibility(view.VISIBLE);
            img.setVisibility(view.GONE);
            img2.setVisibility(view.GONE);
            img3.setVisibility(view.GONE);
            Toast.makeText(this, "IRONMAN", Toast.LENGTH_SHORT).show();

        }
        else if(view.getId()==R.id.imageView1)
        {
            img2.setVisibility(view.VISIBLE);
            img3.setVisibility(view.GONE);
            img1.setVisibility(view.GONE);
            img.setVisibility(view.GONE);
            Toast.makeText(this, "BATMAN", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId()==R.id.imageView2)
        {
            img3.setVisibility(view.VISIBLE);
            img2.setVisibility(view.GONE);
            img1.setVisibility(view.GONE);
            img.setVisibility(view.GONE);
            Toast.makeText(this, "SUPERMAN", Toast.LENGTH_SHORT).show();
        }
        else
        {
            img.setVisibility(view.VISIBLE);
            img2.setVisibility(view.GONE);
            img1.setVisibility(view.GONE);
            img3.setVisibility(view.GONE);
            Toast.makeText(this, "SPIDERMAN", Toast.LENGTH_SHORT).show();
        }
    }
}