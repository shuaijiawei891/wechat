package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private TextView mqiehuan;
private Button denglu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);
        mqiehuan =findViewById (R.id.qiehuan2);
        mqiehuan .setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        denglu =findViewById (R.id.denglu3);
        denglu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this,newsviewActivity.class);

                startActivity(intent);
                Toast.makeText (Main2Activity.this,"登录成功",Toast.LENGTH_SHORT).show ();
        }
        });
    }
}
