package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {

    private Button deptb;
    private Intent idepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        deptb=(Button)findViewById(R.id.deptB);

        deptb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                idepartment=new Intent(Intent.ACTION_VIEW);
                idepartment.setData(Uri.parse("https://kiit.ac.in/academics/schools/"));
                startActivity(idepartment);

            }
        });
    }
}
