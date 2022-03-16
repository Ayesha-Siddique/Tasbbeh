package com.example.practicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button count;
    int a;
    int c;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=this.findViewById(R.id.textView1);
        txt2=this.findViewById(R.id.textView2);
        btn1=this.findViewById(R.id.button1);

        Toast t = Toast.makeText(this, name ,Toast.LENGTH_LONG);

    }


    public void btn1(View view) {
        a=1;
        txt1.setText("Say Alhamdulillah");
    }

    public void btn2(View view) {

        txt1.setText("1st Kalma");
        a=2;
    }

    public void btn3(View view) {
        txt1.setText("Astaghfirullah");
        a=3;
    }

    public void btn4(View view) {
        txt1.setText("Darood");
        a=4;
    }

    public void btn5(View view) {
        txt1.setText("Ayat e karima");
        a=5;
    }

    public void btn6(View view) {
        txt1.setText("Tasbih Ftima");
        a=6;
    }

    public void countt(View view) {
        if(a==1)
        {
            if(a==33)
            {
                txt1.setText("Say Allah o Akbr");
                a=0;
            }
            else if(a==34)
            {
                txt1.setText("Select Tasbeeh");
                a=0;
            }
        }
        else
        {
            if(c<=100)
            {
                c++;
                txt2.setText(Integer.toString(c));
            }
            else
            {
                txt2.setText("RESET");
                Toast t = Toast.makeText(this,"Tasbeeh Finished",Toast.LENGTH_LONG);
                t.show();
            }
        }
    }


}