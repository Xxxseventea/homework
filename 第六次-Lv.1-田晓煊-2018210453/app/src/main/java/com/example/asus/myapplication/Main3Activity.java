package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                Intent a = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(a);
                Toast.makeText(Main3Activity.this,"假装登陆成功",Toast.LENGTH_LONG).show();
                break;
            case R.id.b2:
                Intent b = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(b);
                Toast.makeText(Main3Activity.this,"假装注册成功",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
