package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Courses extends AppCompatActivity {

    private Button coursesb;
    private Intent icourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        coursesb=(Button)findViewById(R.id.coursesB);

        coursesb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                icourses=new Intent(Intent.ACTION_VIEW);
                icourses.setData(Uri.parse("https://kiit.ac.in/academics/courses/"));
                startActivity(icourses);

            }
        });
    }
}
