package com.patateco.qc.ca.businessmoneyworld;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_game);



        final TextView txtTest = (TextView)findViewById(R.id.txtTest);

        ImageButton btnSettings = (ImageButton) this.findViewById(R.id.imgSettings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("Settings");
            }
        });

        ImageButton btnPers = (ImageButton) this.findViewById(R.id.imgPersonnage);
        btnPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("Personnage");
            }
        });

        ImageButton btnNews = (ImageButton) this.findViewById(R.id.imgNews);
        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("News");
            }
        });

        ImageButton btnAction = (ImageButton) this.findViewById(R.id.imgAction);
        btnPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("Actions");
            }
        });

        ImageButton btnPays = (ImageButton) this.findViewById(R.id.imgPays);
        btnPays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("Pays");
            }
        });

        ImageButton btnNext = (ImageButton) this.findViewById(R.id.imgNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText("Next");
            }
        });



        //Personnage personnage = new Personnage(22);





    }
}
