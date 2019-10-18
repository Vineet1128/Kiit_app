package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class home extends AppCompatActivity {

    private ImageView i1,i2,i3,i4,i5,i6,i7;
    private Button b1,b2,b3,b4,b5,b6,b7,kwb;
    //private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        i1=(ImageView)findViewById(R.id.imageView1);
        i2=(ImageView)findViewById(R.id.imageView2);
        i3=(ImageView)findViewById(R.id.imageView3);
        i4=(ImageView)findViewById(R.id.imageView4);
        i5=(ImageView)findViewById(R.id.imageView5);
        i6=(ImageView)findViewById(R.id.imageView6);
        i7=(ImageView)findViewById(R.id.imageView7);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        kwb=(Button)findViewById(R.id.kiitweb);

        kwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ik=new Intent(Intent.ACTION_VIEW);
                ik.setData(Uri.parse("https://kiit.ac.in"));
                startActivity(ik);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Department", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Department.class);
                startActivity(in);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Gallery", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Gallery.class);
                startActivity(in);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Faculty", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Faculty.class);
                startActivity(in);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Courses", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Courses.class);
                startActivity(in);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Fees", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Fees.class);
                startActivity(in);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Facilities", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,Facilities.class);
                startActivity(in);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Co-curricular Activities", Toast.LENGTH_LONG).show();
                Intent in;
                in=new Intent(home.this,CocurricularActivities.class);
                startActivity(in);
            }
        });


    }
}
/*
<intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
 */
