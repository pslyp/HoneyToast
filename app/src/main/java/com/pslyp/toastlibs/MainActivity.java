package com.pslyp.toastlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.pslyp.honeytoast.HoneyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HoneyToast.custom(this, "Test Toast", R.drawable.ic_launcher_background, Color.GREEN, Color.BLUE, Toast.LENGTH_LONG, true).show();
    }
}
