package com.example.kabarohei.toorbaralpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    ImageView imageView;
    AlphaScrollView alphaScrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout= (LinearLayout) findViewById(R.id.title);
        imageView= (ImageView) findViewById(R.id.head);
        alphaScrollView= (AlphaScrollView) findViewById(R.id.scrollview);
        alphaScrollView.findToorbarAndHeadPic(linearLayout,imageView);
        linearLayout.getBackground().setAlpha(0);//透明

    }
}
