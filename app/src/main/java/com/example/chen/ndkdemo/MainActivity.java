package com.example.chen.ndkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Chen on 2017/4/21.
 */

public class MainActivity extends AppCompatActivity {
    TextView text_show_view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        text_show_view = (TextView) findViewById(R.id.show_text);
        text_show_view.setText(JNIutils.getShowString());
        super.onCreate(savedInstanceState);
    }
}
