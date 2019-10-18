package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faculty extends AppCompatActivity {

    private Button facb;
    private Intent iofac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        facb=(Button)findViewById(R.id.facB);

        facb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iofac=new Intent(Intent.ACTION_VIEW);
                iofac.setData(Uri.parse("https://kiit.ac.in/academics/faculty/"));
                startActivity(iofac);

            }
        });
    }
}
