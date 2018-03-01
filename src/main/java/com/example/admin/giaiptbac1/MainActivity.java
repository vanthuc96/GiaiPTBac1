package com.example.admin.giaiptbac1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKetQua;
    EditText inputa,inputb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputa=(EditText) findViewById(R.id.inputa);
        inputb=(EditText) findViewById(R.id.inputb);
        btnKetQua=(Button) findViewById(R.id.btnKetQua);
        btnKetQua.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //tạo Intent để mở class ResultActivity
                Intent myIntent=new Intent(MainActivity.this,ResultActivity.class);
                int a=Integer.parseInt(inputa.getText().toString());
                int b=Integer.parseInt(inputb.getText().toString());
                //Khai báo Bundle để đống gói dữ liệu sang ResultActivity
                Bundle bundle=new Bundle();
                bundle.putInt("sOA",a);//đưa dữ liệu riêng lẻ vào bundle
                bundle.putInt("sOB",b);//soB là key,b là value
                //đưa bundle vào Intent
                myIntent.putExtra("MyPackage",bundle);
                //Mở ResultActivity thông qua intent
                startActivity(myIntent);
            }
        });
    }
}
