package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CocurricularActivities extends AppCompatActivity {

    private Button cocub;
    private Intent icocu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocurricular_activities);

        cocub=(Button)findViewById(R.id.cocuB);

        cocub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                icocu=new Intent(Intent.ACTION_VIEW);
                icocu.setData(Uri.parse("https://kiit.ac.in/students/"));
                startActivity(icocu);

            }
        });
    }
}
