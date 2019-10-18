package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Facilities extends AppCompatActivity {

    private Button facib;
    private Intent ifacilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);

        facib=(Button)findViewById(R.id.faciB);

        facib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ifacilities=new Intent(Intent.ACTION_VIEW);
                ifacilities.setData(Uri.parse("https://kiit.ac.in/academics/schools/"));
                startActivity(ifacilities);

            }
        });
    }
}
