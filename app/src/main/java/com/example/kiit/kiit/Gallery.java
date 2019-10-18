
package com.example.kiit.kiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {

    private ImageView i;
    private Intent iogal;
    private Button next,prev,galleryB;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        i=(ImageView)findViewById(R.id.imageView);
        next=(Button)findViewById(R.id.nextB);
        prev=(Button)findViewById(R.id.prevB);
        galleryB=(Button)findViewById(R.id.galB);

        final ArrayList<Integer> array_image = new ArrayList<Integer>();
        array_image.add(R.drawable.g0);
        array_image.add(R.drawable.g1);
        array_image.add(R.drawable.g2);
        array_image.add(R.drawable.g3);
        array_image.add(R.drawable.g4);
        array_image.add(R.drawable.g5);
        array_image.add(R.drawable.g6);
        array_image.add(R.drawable.g7);
        array_image.add(R.drawable.g8);
        array_image.add(R.drawable.g9);
        array_image.add(R.drawable.g10);
        array_image.add(R.drawable.g11);
        array_image.add(R.drawable.g12);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x+=1;
                if(x==13)
                    x=0;
                i.setImageResource(array_image.get(x));

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x-=1;
                if(x==-1)
                    x=12;
                i.setImageResource(array_image.get(x));

            }
        });


        galleryB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iogal=new Intent(Intent.ACTION_VIEW);
                iogal.setData(Uri.parse("https://kiit.ac.in/campuslife"));
                startActivity(iogal);

            }
        });
    }
}
