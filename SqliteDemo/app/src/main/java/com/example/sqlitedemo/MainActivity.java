package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed_name;
    EditText ed_email;
    EditText ed_phone;
    Button btn_write;
    Button btn_read;
    Button btn_update;
    Button btn_remove;
    TextView tv_records;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void myFindViewByID(){
        ed_email=findViewById(R.id.ed_email);
        ed_name=findViewById(R.id.ed_name);
        ed_phone=findViewById(R.id.ed_phone);
        btn_write=findViewById(R.id.btn_write);
        btn_read=findViewById(R.id.btn_read);
        btn_remove=findViewById(R.id.btn_remove);
        btn_update=findViewById(R.id.btn_update);
        tv_records=findViewById(R.id.tv_records);

    }


    public void myClick(View view) {

        //创建数据库操作类
        DatabaseOperator db=new DatabaseOperator(this);
        switch (view.getId()){
            case R.id.btn_write:
                String phone=ed_phone.getText().toString();
                if(db.checkPhoneISAlreadyInDBorNot(phone)){
                    //已经存在手机号
                    Toast.makeText(this,"The phone has been registered!",Toast.LENGTH_SHORT).show();
                    break;
                }
                String name=ed_name.getText().toString();
                String email=ed_email.getText().toString();
                db.add(name,email,phone);
                Toast.makeText(this,"Save successed!",Toast.LENGTH_SHORT).show();



                break;
            case R.id.btn_read:

                break;
            case R.id.btn_update:

                break;
            case R.id.btn_remove:

                break;

            default:
                break;

        }

    }
}