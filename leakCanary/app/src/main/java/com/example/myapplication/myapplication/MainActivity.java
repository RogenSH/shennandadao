package com.example.myapplication.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        OutMethod();
        btn.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
//                OutMethod();
                new MyReference().weakRefereceTest();
            }
        });



    }



    private void OutMethod(){
        InnerMethod1();
        InnerMethod2();
        InnerMethod3();
    }

    private void InnerMethod1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void InnerMethod2(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void InnerMethod3() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}