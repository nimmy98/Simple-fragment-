package com.example.nimmy.task1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ll;
    private Button btn1,btn2,btn3;

    //Fragment fragmentOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout)findViewById(R.id.ll_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
       // final LinearLayout dj=(LinearLayout)findViewById(R.id.princess);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentOne fragmentOne;
                fragmentOne = new FragmentOne();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.ll_main,fragmentOne);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTwo fragmentTwo;
                fragmentTwo = new FragmentTwo();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.ll_main,fragmentTwo);
                ft.addToBackStack("");
                ft.commit();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentThree fragmentThree;
                fragmentThree = new FragmentThree();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.ll_main,fragmentThree);
                ft.addToBackStack("");
                ft.commit();

            }
        });
    }


}
