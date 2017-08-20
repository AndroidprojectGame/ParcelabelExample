package com.social.chaudhary.parcelabelexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        String myData=b.getString("myData");
        Toast.makeText(this, "myData="+myData, Toast.LENGTH_SHORT).show();
        Person person=(Person)b.getParcelable("person");
        //System.out.println(person.getFirstName());
        Toast.makeText(this, "Fname="+person.getFirstName()+person.getLastName()+person.getQualification(), Toast.LENGTH_SHORT).show();
    }
}
