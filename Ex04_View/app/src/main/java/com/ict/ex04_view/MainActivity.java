package com.ict.ex04_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      layout 화면을 지정하는 메소드
        setContentView(R.layout.myview);
//      xml에서 지정한 view들을 객체로 맏늘어서 사용하기
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        tv1.setTextColor(Color.BLUE);
        tv2.setText("KOREA seoul");
        String msg = tv1.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        tv2.setTextSize(40);
    }
}
