package com.kina.mygit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_feature_1, btn_feature_2, btn_feature_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_feature_1 = (Button) findViewById(R.id.btn_feature_1);
        btn_feature_2 = (Button) findViewById(R.id.btn_feature_2);
        btn_feature_3 = (Button) findViewById(R.id.btn_feature_3);
    }

    public void feature_1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText("修改1");
        } else {
            btn_feature_1.setText("原本1");
        }
    }

    public void feature_2(View view) {
        if (btn_feature_2.getText().toString().equals("功能2")) {
            btn_feature_2.setText("修改2");
        } else {
            btn_feature_2.setText("原本2");
        }
    }

    public void feature_3(View view) {
        if (btn_feature_3.getText().toString().equals("功能3")) {
            btn_feature_3.setText("修改3");
        } else {
            btn_feature_3.setText("原本3");
        }
    }

}
