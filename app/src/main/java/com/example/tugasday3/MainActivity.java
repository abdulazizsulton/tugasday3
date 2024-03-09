package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivIphone, ivIphone2, ivIphone3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView ivIphone = findViewById(R.id.ivIphone);
        ImageView ivIphone2 = findViewById(R.id.ivIphone2);
        ImageView ivIphone3 = findViewById(R.id.ivIphone3);

        ivIphone.setOnClickListener(this);
        ivIphone2.setOnClickListener(this);
        ivIphone3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivIphone) {
            //lakukan aksi
            Intent intentiphone = new Intent(MainActivity.this, hpactivity.class);
            intentiphone.putExtra("IMAGE_RESOURCE_ID", R.drawable.iphone13);
            startActivity(intentiphone);

        } else if (v.getId()==R.id.ivIphone2) {

            Intent intentiphone2= new Intent(MainActivity.this, MacActivity2.class);
            intentiphone2.putExtra("IMAGE_RESOURCE_ID",R.drawable.macm1 );
            startActivity(intentiphone2);

        } else if (v.getId()==R.id.ivIphone3) {

            Intent intentiphone3 = new Intent(MainActivity.this, IpadActivity2.class);
            intentiphone3.putExtra("IMAGE_RESOURCE_ID",R.drawable.ipadmini);
            startActivity(intentiphone3);

        }
    }
}