package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMI_Calc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtheightFT , edtheightIN , edtweight;
        Button   btncal;
        TextView txtshow;
        LinearLayout llmain;

        edtweight = findViewById(R.id.edtweight);
        edtheightFT=findViewById(R.id.edtheightFT);
        edtheightIN=findViewById(R.id.edtheightIN);
        btncal=findViewById(R.id.btncal);
        txtshow=findViewById(R.id.txtRESULT);
        llmain=findViewById(R.id.llmain);

        btncal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               int wt = Integer.parseInt(edtweight.getText().toString());
                int htf = Integer.parseInt(edtheightFT.getText().toString());
                 int hti = Integer.parseInt(edtheightIN.getText().toString());

                 int totalIN = htf*12 + hti;

                 double totalCM = totalIN*2.53;

                 double totalM = totalCM/100;

                 double BMI = wt/(totalM*totalM);

                 if (BMI>25){
                    txtshow.setText("you are Over-Weight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.red));

                 } else if (BMI<18) {
                     txtshow.setText("you are Under-Weight");
                     llmain.setBackgroundColor(getResources().getColor(R.color.yellow));
                 }
                 else {
                     txtshow.setText("CONGRAULATION YOU ARE HEALTHY !!!");
                     llmain.setBackgroundColor(getResources().getColor(R.color.green));
                 }

            }
        });
    }
}