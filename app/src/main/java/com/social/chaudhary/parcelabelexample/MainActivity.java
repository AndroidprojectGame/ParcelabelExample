package com.social.chaudhary.parcelabelexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("myData","Data is comming from First Activity");

                Person p=new Person();
                p.setFirstName("Ram");
                p.setLastName("Kumar");
                p.setQualification("MCA");
                i.putExtra("person",p);
                startActivity(i);
                //hello
            }
        });
    }
}
