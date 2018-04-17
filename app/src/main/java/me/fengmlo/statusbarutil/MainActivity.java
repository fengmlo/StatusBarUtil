package me.fengmlo.statusbarutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.fengmlo.library.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StatusBarUtil.transparencyBar(this);
        StatusBarUtil.statusBarLightMode(this);
        StatusBarUtil.paddingRootView(this);
    }
}
