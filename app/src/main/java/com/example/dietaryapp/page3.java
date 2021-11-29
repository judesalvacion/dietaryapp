package com.example.dietaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3 extends AppCompatActivity {

    private Button button, monday, tuesday, wednesday, thursday, friday, saturday, sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        monday = (Button) findViewById(R.id.monday);
        tuesday = (Button) findViewById(R.id.tuesday);
        wednesday = (Button) findViewById(R.id.wednesday);
        thursday = (Button) findViewById(R.id.thurdy);
        friday = (Button) findViewById(R.id.friday);
        saturday = (Button) findViewById(R.id.saturday);
        sunday = (Button) findViewById(R.id.sunday);
        button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmainpage2();


            }
        });

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmon2();
            }
        });

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentuesday();

            }
        });
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwdns();

            }
        });
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthurdy();
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfriday();
            }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensaturday();
            }
        });
        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensunday();
            }
        });
    }
    public void openmon2() {
        Intent intent = new Intent(this, mon2.class);
        startActivity(intent);
    }

    public void openmainpage2() {
        Intent intent = new Intent(this, mainpage2.class);
        startActivity(intent);

    }

    public void opentuesday() {
        Intent intent = new Intent(this, tuesday.class);
        startActivity(intent);
    }


    public void openwdns() {
        Intent intent = new Intent(this, wdns.class);
        startActivity(intent);
    }

    public void openthurdy() {
        Intent intent = new Intent(this, thurdy.class);
        startActivity(intent);
    }

    public void openfriday() {
        Intent intent = new Intent(this, friday.class);
        startActivity(intent);
    }

    public void opensaturday() {
        Intent intent = new Intent(this, saturday.class);
        startActivity(intent);
    }

    public void opensunday() {
        Intent intent = new Intent(this, sunday.class);
        startActivity(intent);
    }
}