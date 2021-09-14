package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void click(View view){
        //hides keyboad after clicking
        LinearLayout mainLayout;
        mainLayout = (LinearLayout)findViewById(R.id.mylinear);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);

        String s; // Used to Store Temp
        int n,h,w;
        Double bmi;
        bmi=0.0;
        n=0;
        h=0;
        w=0;

        TextView texthello = findViewById(R.id.name1);
        TextView texthello2 = findViewById(R.id.age);
        TextView texthello3 = findViewById(R.id.h);
        TextView texthello4 = findViewById(R.id.w);
        TextView texthello5 = findViewById(R.id.d);


        EditText edittext = findViewById(R.id.txtname);
        EditText edittext2 = findViewById(R.id.txtloan);
        EditText edittext3 = findViewById(R.id.txth);
        EditText edittext4 = findViewById(R.id.txtw);

        s=edittext2.getText().toString();
        n = Integer.parseInt(s);
        s=edittext3.getText().toString();
        h = Integer.parseInt(s);
        s=edittext4.getText().toString();
        w = Integer.parseInt(s);
        //writing tot the screen

        int h2=h*h;
        int m=10000;
        float h3=(float)h2/m;
        int p;
        p=Math.round(w/h3);
        texthello.setText("Name : "+edittext.getText().toString());
        texthello2.setText("BMI : "+(float)w/h3);
        texthello3.setText("Height : "+h);
        texthello4.setText("Weight : "+w);

        if((float)w/h3<18)
        {
            texthello5.setText("Low BMI");
        }
        else if((float)w/h3>=18 && (float)w/h3<=25 )
        {
            texthello5.setText("Healthy BMI");
        }
        else
        {
            texthello5.setText("High BMI");
        }
        bmi=0.0;
        n=0;
        h=0;
        w=0;






    }



}