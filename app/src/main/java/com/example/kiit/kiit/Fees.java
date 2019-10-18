package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fees extends AppCompatActivity {

    private Button feeb;
    private Intent ifees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);

        feeb=(Button)findViewById(R.id.feeB);

        feeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ifees=new Intent(Intent.ACTION_VIEW);
                ifees.setData(Uri.parse("https://www.getmyuni.com/college/kalinga-institute-of-industrial-technology-kiit-university-bhubaneswar-courses-fees"));
                startActivity(ifees);

            }
        });
    }
}
