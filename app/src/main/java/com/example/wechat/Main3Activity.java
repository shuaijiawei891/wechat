package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
private TextView qiehuan;
private Button denglu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main3);
        qiehuan=findViewById (R.id.qiehuan);
        qiehuan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText (Main3Activity.this,"该功能正在开发中....",Toast.LENGTH_SHORT).show ();
            }
        });
        denglu=findViewById (R.id.denglu);
        denglu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,newsviewActivity.class);

                startActivity(intent);
                Toast.makeText (Main3Activity.this,"登录成功",Toast.LENGTH_SHORT).show ();
            }
        });
    }
}
