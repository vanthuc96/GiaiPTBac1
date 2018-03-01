package com.example.admin.giaiptbac1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView txtKetQua;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtKetQua=(TextView) findViewById(R.id.txtKetQua);
        //lấy intent đã gọi ResultActivity
        Intent callerIntent=getIntent();
        // lấy bundle đã gửi
        Bundle packBundle=callerIntent.getBundleExtra("MyPackage");
        //lấy giá trị a,b chuyển sang
        int a=packBundle.getInt("sOA");
        int b=packBundle.getInt("sOB");
        GiaiPhuongTrinhBac1(a,b);
        btnBack=(Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent myIntent=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
    public void GiaiPhuongTrinhBac1(int a,int b){
        if(a==0){
            if(b==0){
                txtKetQua.setText("Phương trình vô số nghiệm");

            }
            else{
                txtKetQua.setText("Phương trình vô nghiệm");
            }
        }
        else{
            txtKetQua.setText(String.valueOf((float)-b/a));
        }
    }
}
